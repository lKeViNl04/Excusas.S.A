package com.primerparcial.strategy;

import com.primerparcial.inchargers.InCharge;
import com.primerparcial.Excuse;
import com.primerparcial.email.EmailSender;

public class Lazy implements Strategy {

    @Override
    public void handlerExcuse(InCharge inCharge, Excuse excuse, EmailSender emailSender) {
        System.out.println("I don't want to do it, let someone else do it.");
        inCharge.nextHandlerExcuse(excuse);
    }
}
