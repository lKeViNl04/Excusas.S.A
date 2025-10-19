package com.primerparcial.strategy;

import com.primerparcial.inchargers.InCharge;
import com.primerparcial.Excuse;
import com.primerparcial.email.EmailSender;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class ProductiveTest {

    @Mock
    private InCharge mockInCharge;
    @Mock
    private Excuse mockExcuse;
    @Mock
    private EmailSender mockEmailSender;

    @Test
    @DisplayName("Debe procesar la excusa y enviar un email de notificación al CTO")
    void shouldProcessExcuseAndSendNotificationEmail() {
        Productive productiveStrategy = new Productive();
        ArgumentCaptor<String> toCaptor = ArgumentCaptor.forClass(String.class);
        ArgumentCaptor<String> subjectCaptor = ArgumentCaptor.forClass(String.class);
        productiveStrategy.handlerExcuse(mockInCharge, mockExcuse, mockEmailSender);
        verify(mockInCharge, times(1)).processExcuse(mockExcuse, mockEmailSender);
        verify(mockEmailSender, times(1)).sendEmail(toCaptor.capture(), anyString(), subjectCaptor.capture(), anyString());
        assertEquals("CTO@gmail.com", toCaptor.getValue());
        assertEquals("Excuse Employee", subjectCaptor.getValue());
    }
}
