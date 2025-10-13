package com.primerparcial.excuse.type.impl;

import com.primerparcial.excuse.Excuse;
import com.primerparcial.excuse.type.ModerateExcuse;
import com.primerparcial.utils.EmailSender;

public class PowerOutage extends ModerateExcuse {
    public PowerOutage() {
        super();
    }

    @Override
    public void executeProcess(Excuse excuse, EmailSender emailSender) {
        emailSender.sendEmail("EDESUR@mailfake.com.ar","Excusas.S.A.@gmail.com",
                "question about the blackout","was there a blackout in such neighborhood?");
    }
}
