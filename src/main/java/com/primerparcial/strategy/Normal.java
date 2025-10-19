package com.primerparcial.strategy;

import com.primerparcial.inchargers.InCharge;
import com.primerparcial.Excuse;
import com.primerparcial.email.EmailSender;

public class Normal implements Strategy {

    @Override
    public void handlerExcuse(InCharge inCharge, Excuse excuse, EmailSender emailSender) {
        inCharge.processExcuse(excuse, emailSender);
    }
}
