package com.primerparcial.chain.impl;

import com.primerparcial.chain.InCharge;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.observer.Prontuario;
import com.primerparcial.observer.ProntuarioAdministrator;
import com.primerparcial.observer.observer.Subscriber;
import com.primerparcial.strategy.Strategy;
import com.primerparcial.utils.EmailSender;

public class CEO extends InCharge implements Subscriber {


    protected CEO(String name, String email, Long legajo, Strategy strategy) {
        super(name, email, legajo, strategy);
    }

    @Override
    public boolean processTypeImplausible(){ return true; }

    @Override
    public void processExcuse(Excuse excuse, EmailSender emailSender) {
        excuse.getTypeExcuse().executeProcess(excuse, emailSender);
        Prontuario newProntuario = new Prontuario(excuse.getEmployee(),excuse);
        ProntuarioAdministrator.getInstance().addProntuario(newProntuario);
    }

    @Override
    public void update() {
        System.out.println("Se ha agregado un nuevo prontuario");
    }
}
