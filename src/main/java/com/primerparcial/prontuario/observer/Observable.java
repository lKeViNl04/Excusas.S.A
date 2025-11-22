package com.primerparcial.prontuario.observer;

import com.primerparcial.prontuario.Prontuario;

import java.util.ArrayList;

public abstract class Observable implements Publisher{
    protected ArrayList<Subscriber> subscribers;

    protected Observable() {
        subscribers = new ArrayList<>();
    }

    public void addSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    public void removeSubscriber(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void notifySubscribers(Prontuario prontuario) {
    for (Subscriber subscriber : subscribers) {
        subscriber.update(prontuario);
    }
    }

}
