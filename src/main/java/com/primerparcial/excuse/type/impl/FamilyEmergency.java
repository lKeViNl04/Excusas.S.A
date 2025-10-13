package com.primerparcial.excuse.type.impl;

import com.primerparcial.excuse.Excuse;
import com.primerparcial.excuse.type.ModerateExcuse;
import com.primerparcial.utils.EmailSender;

public class FamilyEmergency extends ModerateExcuse {
    public FamilyEmergency() {
        super();
    }

    @Override
    public void executeProcess(Excuse excuse, EmailSender emailSender) {
        emailSender.sendEmail(excuse.getEmployee().getEmail(),"Excusas.S.A.@gmail.com",
                "concern to the employee","is everything okay?");
    }
}
