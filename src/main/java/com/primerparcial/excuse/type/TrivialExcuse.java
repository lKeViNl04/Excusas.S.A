package com.primerparcial.excuse.type;

import com.primerparcial.chain.InCharge;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.utils.EmailSender;

public abstract class TrivialExcuse implements TypeExcuse{
    @Override
    public boolean processType(InCharge inCharge) {
        return inCharge.processTypeTrivial();
    }

    @Override
    public void executeProcess(Excuse excuse, EmailSender emailSender) {
        emailSender.sendEmail(excuse.getEmployee().getEmail(),"Excusas.S.A.@gmail.com",
                "reason for delay","the license was accepted");
    }
}
