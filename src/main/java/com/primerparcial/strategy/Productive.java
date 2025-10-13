package com.primerparcial.strategy;

import com.primerparcial.chain.InCharge;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.utils.EmailSender;

public class Productive implements Strategy {

    @Override
    public void handlerExcuse(InCharge inCharge, Excuse excuse, EmailSender emailSender) {
        inCharge.processExcuse(excuse, emailSender);
        emailSender.sendEmail("CTO@gmail.com","EExcusas.S.A.@gmail.com",
                "Excuse Employee", "I'll keep you informed of everything");
    }
}
