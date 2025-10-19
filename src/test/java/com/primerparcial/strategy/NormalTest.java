package com.primerparcial.strategy;

import com.primerparcial.inchargers.InCharge;
import com.primerparcial.Excuse;
import com.primerparcial.email.EmailSender;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
class NormalTest {

    @Mock
    private InCharge mockInCharge;
    @Mock
    private Excuse mockExcuse;
    @Mock
    private EmailSender mockEmailSender;

    @Test
    @DisplayName("Debe procesar la excusa directamente")
    void shouldProcessExcuseDirectly() {
        Normal normalStrategy = new Normal();
        normalStrategy.handlerExcuse(mockInCharge, mockExcuse, mockEmailSender);
        verify(mockInCharge, times(1)).processExcuse(mockExcuse, mockEmailSender);
        verify(mockInCharge, never()).nextHandlerExcuse(any());
    }
}
