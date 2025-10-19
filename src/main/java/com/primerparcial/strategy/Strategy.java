package com.primerparcial.strategy;

import com.primerparcial.inchargers.InCharge;
import com.primerparcial.Excuse;
import com.primerparcial.email.EmailSender;

public interface Strategy {
    public void handlerExcuse(InCharge inCharge, Excuse excuse, EmailSender emailSender);
}
