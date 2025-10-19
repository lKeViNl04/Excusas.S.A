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
class LazyTest {

    @Mock
    private InCharge mockInCharge;
    @Mock
    private Excuse mockExcuse;
    @Mock
    private EmailSender mockEmailSender;

    @Test
    @DisplayName("Debe pasar la excusa al siguiente encargado y no procesarla")
    void shouldPassExcuseToNextHandler() {
        Lazy lazyStrategy = new Lazy();
        lazyStrategy.handlerExcuse(mockInCharge, mockExcuse, mockEmailSender);
        verify(mockInCharge, times(1)).nextHandlerExcuse(mockExcuse);
        verify(mockInCharge, never()).processExcuse(any(), any());
    }
}
