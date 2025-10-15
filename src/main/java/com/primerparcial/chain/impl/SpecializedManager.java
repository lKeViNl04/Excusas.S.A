package com.primerparcial.chain.impl;

import com.primerparcial.chain.InCharge;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.strategy.Normal;
import com.primerparcial.utils.EmailSender;

public class SpecializedManager extends InCharge {

    protected SpecializedManager(String name, String email, Long legajo) {
        super(name, email, legajo, new Normal());
    }

    @Override
    public boolean processTypeDefault(){ return true; }

    @Override
    public void processExcuse(Excuse excuse, EmailSender emailSender) {
        emailSender.sendEmail(excuse.getEmployee().getEmail(),"SpecializedManager@gmail.com",
                "excuse rejected", "we need hard evidence");
    }
}
