package com.primerparcial.inchargers;

import com.primerparcial.Employee;
import com.primerparcial.Excuse;
import com.primerparcial.typeExcuse.ComplexExcuse;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class SpecializedManagerTest {

    @Mock
    private Handler mockNextHandler;
    @Mock
    private Employee mockEmployee;

    private SpecializedManager specializedManager;

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    void setUp() {
        // Redirigimos la salida estándar a nuestro capturador en memoria
        System.setOut(new PrintStream(outContent));

        specializedManager = new SpecializedManager("Manager Test", "manager@test.com", 500L);
        specializedManager.setHandler(mockNextHandler);

        when(mockEmployee.getEmail()).thenReturn("employee@test.com");
    }

    @AfterEach
    void tearDown() {
        // Restauramos la salida estándar original después de cada test
        System.setOut(originalOut);
    }

    @Test
    @DisplayName("Debe procesar la excusa e imprimir el email de rechazo en consola")
    void shouldProcessExcuseAndPrintRejectionEmail() {
        Excuse anyExcuse = new Excuse(mockEmployee, new ComplexExcuse());
        specializedManager.handlerExcuse(anyExcuse);
        String capturedOutput = outContent.toString(); 

        assertTrue(capturedOutput.contains("To: employee@test.com"));
        assertTrue(capturedOutput.contains("From: manager@test.com"));
        assertTrue(capturedOutput.contains("Subject: excuse rejected"));
        assertTrue(capturedOutput.contains("Body: we need hard evidence"));

        verify(mockNextHandler, never()).handlerExcuse(any(Excuse.class));
    }
}