package com.primerparcial.inchargers;

import com.primerparcial.inchargers.InCharge;
import com.primerparcial.Excuse;
import com.primerparcial.strategy.Normal;
import com.primerparcial.email.EmailSender;

public class SpecializedManager extends InCharge {

    public SpecializedManager(String name, String email, Long legajo) {
        super(name, email, legajo, new Normal());
    }

    @Override
    public void processExcuse(Excuse excuse, EmailSender emailSender) {
        emailSender.sendEmail(excuse.getEmployee().getEmail(),getEmail(),
                "excuse rejected", "we need hard evidence");
    }

    @Override
    protected boolean canHandleExcuse(Excuse excuse) {
        return excuse.isModerate() || excuse.isTrivial() || excuse.isImplausible() || excuse.isComplex();
    }
}
