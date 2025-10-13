package com.primerparcial.observer;

import com.primerparcial.observer.observer.Observable;

import java.util.ArrayList;

public class ProntuarioAdministrator extends Observable {

    private static ProntuarioAdministrator instance;
    private ArrayList<Prontuario> prontuarios;

    private ProntuarioAdministrator(){
        prontuarios = new ArrayList<>();
    }

    public static ProntuarioAdministrator getInstance(){
        if(instance == null){
            instance = new ProntuarioAdministrator();
        }
        return instance;
    }

    public void addProntuario(Prontuario prontuario){
        prontuarios.add(prontuario);
    }

}
