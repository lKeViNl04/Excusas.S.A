package com.primerparcial.typeExcuse.impl;

import com.primerparcial.Excuse;
import com.primerparcial.typeExcuse.ModerateExcuse;
import com.primerparcial.email.EmailSender;

public class PowerOutage extends ModerateExcuse {
    public PowerOutage() {
        super();
    }

    @Override
    protected String getDestinationEmail(Excuse excuse){
        return "EDESUR@mailfake.com.ar";
    }

    @Override
    protected String getAffair() {
        return "question about the blackout";
    }

    @Override
    protected String getBody() {
        return "was there a blackout in such neighborhood?";
    }
}
