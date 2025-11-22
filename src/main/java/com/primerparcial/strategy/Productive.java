package com.primerparcial.strategy;

import com.primerparcial.employee.incharge.InCharge;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.email.EmailSender;

public class Productive implements Strategy {

    @Override
    public void handlerExcuse(InCharge inCharge, Excuse excuse, EmailSender emailSender) {
        inCharge.processExcuse(excuse, emailSender);
        emailSender.sendEmail("CTO@gmail.com","Excusas.S.A.@gmail.com",
                "Excuse Employee", "I'll keep you informed of everything");
    }
}
