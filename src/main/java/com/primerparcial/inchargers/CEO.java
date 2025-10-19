package com.primerparcial.inchargers;

import com.primerparcial.inchargers.InCharge;
import com.primerparcial.Excuse;
import com.primerparcial.prontuario.Prontuario;
import com.primerparcial.prontuario.ProntuarioAdministrator;
import com.primerparcial.observer.Subscriber;
import com.primerparcial.strategy.Strategy;
import com.primerparcial.email.EmailSender;

public class CEO extends InCharge implements Subscriber {

    protected CEO(String name, String email, Long legajo, Strategy strategy) {
        super(name, email, legajo, strategy);
    }



    @Override
    public void processExcuse(Excuse excuse, EmailSender emailSender) {
        excuse.executeProcess(excuse, emailSender);
        Prontuario newProntuario = new Prontuario(excuse.getEmployee(),excuse);
        ProntuarioAdministrator.getInstance().addProntuario(newProntuario);
    }

    @Override
    protected boolean canHandleExcuse(Excuse excuse) {
        return excuse.isImplausible();
    }

    @Override
    public void update() { System.out.println("A new prontuario has been added");}
}
