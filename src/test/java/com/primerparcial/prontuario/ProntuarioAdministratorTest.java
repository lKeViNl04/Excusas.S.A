package com.primerparcial.prontuario;

import com.primerparcial.prontuario.observer.Subscriber;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class ProntuarioAdministratorTest {

    @Mock
    private Prontuario mockProntuario;
    @Mock
    private Subscriber mockSubscriber1;
    @Mock
    private Subscriber mockSubscriber2;

    private ProntuarioAdministrator admin;

    @BeforeEach
    void setUp() {
        admin = ProntuarioAdministrator.getInstance();
        admin.reset();
    }

    @Test
    @DisplayName("getInstance() debe devolver siempre la misma instancia")
    void shouldAlwaysReturnSameInstance() {
        ProntuarioAdministrator anotherInstance = ProntuarioAdministrator.getInstance();
        assertSame(admin, anotherInstance, "getInstance() debería ser un Singleton.");
    }

    @Test
    @DisplayName("addProntuario debe añadir un prontuario a la lista")
    void shouldAddProntuarioToList() {
        admin.addProntuario(mockProntuario);

        assertEquals(1, admin.getProntuarios().size(), "La lista de prontuarios debería tener 1 elemento.");
        assertTrue(admin.getProntuarios().contains(mockProntuario), "La lista debería contener el prontuario añadido.");
    }

    @Test
    @DisplayName("addProntuario debe notificar a todos los suscriptores")
    void shouldNotifyAllSubscribersWhenProntuarioIsAdded() {
        admin.addSubscriber(mockSubscriber1);
        admin.addSubscriber(mockSubscriber2);
        admin.addProntuario(mockProntuario);
        verify(mockSubscriber1, times(1)).update(mockProntuario);
        verify(mockSubscriber2, times(1)).update(mockProntuario);
    }

    @Test
    @DisplayName("unsubscribe debe remover un suscriptor y no notificarlo")
    void shouldRemoveSubscriberAndNotNotify() {
        admin.addSubscriber(mockSubscriber1);
        admin.addSubscriber(mockSubscriber2);
        admin.removeSubscriber(mockSubscriber2);
        admin.addProntuario(mockProntuario);
        verify(mockSubscriber1, times(1)).update(mockProntuario);
        verify(mockSubscriber2, times(0)).update(mockProntuario);
    }
}