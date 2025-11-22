package com.primerparcial.typeExcuse;

import com.primerparcial.employee.Employee;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.email.EmailSender;
import com.primerparcial.excuse.typeexcuse.TypeExcuse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public abstract class TypeExcuseTestBase {

    @Mock
    protected EmailSender mockEmailSender;
    @Mock
    protected Excuse mockExcuse;
    @Mock
    protected Employee mockEmployee;
    // Métodos abstractos que cada test concreto DEBE implementar
    protected abstract TypeExcuse createTypeExcuse();
    protected abstract String getExpectedAffair();
    protected abstract String getExpectedBody();
    // Método con implementación por defecto (la mayoría de los casos)
    protected String getExpectedDestinationEmail() {
        return "test.employee@company.com";
    }

    @BeforeEach
    void setUp() {
        lenient().when(mockExcuse.getEmployee()).thenReturn(mockEmployee);
        lenient().when(mockEmployee.getEmail()).thenReturn("test.employee@company.com");
    }

    @Test
    @DisplayName("Debe enviar un email con el formato y contenido correctos")
    void shouldSendCorrectlyFormattedEmail() {
        // Arrange
        TypeExcuse typeExcuse = createTypeExcuse();
        ArgumentCaptor<String> to = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> from = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> affair = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> body = ArgumentCaptor.forClass(String.class);
        // Act
        typeExcuse.executeProcess(mockExcuse, mockEmailSender);
        // Assert
        verify(mockEmailSender).sendEmail(to.capture(), from.capture(), affair.capture(), body.capture());

        assertEquals(getExpectedDestinationEmail(), to.getValue());
        assertEquals("Excusas.S.A.@gmail.com", from.getValue());
        assertEquals(getExpectedAffair(), affair.getValue());
        assertEquals(getExpectedBody(), body.getValue());
    }
}