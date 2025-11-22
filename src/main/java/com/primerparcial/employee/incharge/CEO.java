package com.primerparcial.employee.incharge;

import com.primerparcial.excuse.Excuse;
import com.primerparcial.prontuario.Prontuario;
import com.primerparcial.prontuario.ProntuarioAdministrator;
import com.primerparcial.prontuario.observer.Subscriber;
import com.primerparcial.strategy.Strategy;
import com.primerparcial.email.EmailSender;

public class CEO extends InCharge implements Subscriber {

    public CEO(String name, String email, Long legajo, Strategy strategy) {
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
    public void update(Prontuario prontuario) { System.out.println("A new prontuario has been added \n" + prontuario.toString());}
}
