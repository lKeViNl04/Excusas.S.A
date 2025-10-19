package com.primerparcial.prontuario;

import com.primerparcial.observer.Observable;

import java.util.ArrayList;
import java.util.List;

public class ProntuarioAdministrator extends Observable {

    private static ProntuarioAdministrator instance;
    private ArrayList<Prontuario> prontuarios;

    private ProntuarioAdministrator(){
        prontuarios = new ArrayList<>();
    }

    public List<Prontuario> getProntuarios(){ return prontuarios; }

    public void reset() {
        prontuarios.clear();
        subscribers.clear();
    }

    public static ProntuarioAdministrator getInstance(){
        if(instance == null){
            instance = new ProntuarioAdministrator();
        }
        return instance;
    }

    public void addProntuario(Prontuario prontuario){
        prontuarios.add(prontuario);
        notifySubscribers();
    }

}
