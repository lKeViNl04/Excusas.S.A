package com.primerparcial.prontuario.observer;


import com.primerparcial.prontuario.Prontuario;

public interface Subscriber {
    public void update(Prontuario prontuario);
}
