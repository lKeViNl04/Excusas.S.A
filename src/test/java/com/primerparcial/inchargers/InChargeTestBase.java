package com.primerparcial.inchargers;

import com.primerparcial.Employee;
import com.primerparcial.Excuse;
import com.primerparcial.strategy.Strategy;
import com.primerparcial.typeExcuse.TypeExcuse;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public abstract class InChargeTestBase {

    // 1. Mocks comunes para todos los tests
    @Mock
    protected Handler mockNextHandler;
    @Mock
    protected Employee mockEmployee;
    @Mock
    protected Strategy mockStrategy;

    // 2. El objeto que se está probando (será creado por las clases hijas)
    protected InCharge inCharge;

    // 3. Métodos abstractos que las clases hijas DEBEN implementar
    protected abstract InCharge createInCharge();
    protected abstract TypeExcuse getExcuseToHandle(); // Devuelve el tipo de excusa que SÍ debe manejar
    protected abstract TypeExcuse getExcuseToPass();   // Devuelve el tipo de excusa que NO debe manejar

    @BeforeEach
    void setUp() {
        inCharge = createInCharge();
        inCharge.setHandler(mockNextHandler);
    }

    // 4. Tests genéricos que usan los métodos abstractos
    @Test
    @DisplayName("Debe manejar la excusa correcta y no pasarla al siguiente")
    void shouldHandleCorrectExcuseType() {
        // Arrange
        Excuse excuseToHandle = new Excuse(mockEmployee, getExcuseToHandle());
        // Act
        inCharge.handlerExcuse(excuseToHandle);
        // Assert
        verify(mockStrategy).handlerExcuse(any(InCharge.class), any(Excuse.class), any());
        verify(mockNextHandler, never()).handlerExcuse(any(Excuse.class));
    }

    @Test
    @DisplayName("Debe pasar una excusa incorrecta al siguiente encargado")
    void shouldPassIncorrectExcuseType() {
        // Arrange
        Excuse excuseToPass = new Excuse(mockEmployee, getExcuseToPass());
        // Act
        inCharge.handlerExcuse(excuseToPass);
        // Assert
        verify(mockStrategy, never()).handlerExcuse(any(), any(), any());
        verify(mockNextHandler, times(1)).handlerExcuse(excuseToPass);
    }
}
