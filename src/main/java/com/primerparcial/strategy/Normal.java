package com.primerparcial.strategy;

import com.primerparcial.chain.InCharge;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.utils.EmailSender;

public class Normal implements Strategy {

    @Override
    public void handlerExcuse(InCharge inCharge, Excuse excuse, EmailSender emailSender) {
        inCharge.processExcuse(excuse, emailSender);
    }
}
