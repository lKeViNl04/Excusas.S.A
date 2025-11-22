package com.primerparcial.prontuario.observer;

import com.primerparcial.prontuario.Prontuario;

public interface Publisher {

    public void addSubscriber(Subscriber subscriber);
    public void removeSubscriber(Subscriber subscriber);
    public void notifySubscribers(Prontuario prontuario);
}
