package com.primerparcial.strategy;

import com.primerparcial.chain.InCharge;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.utils.EmailSender;

public interface Strategy {
    public void handlerExcuse(InCharge inCharge, Excuse excuse, EmailSender emailSender);
}
