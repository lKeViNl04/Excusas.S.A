package com.primerparcial.excuse.type.impl;

import com.primerparcial.excuse.Excuse;
import com.primerparcial.excuse.type.ModerateExcuse;
import com.primerparcial.utils.EmailSender;

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
