package com.primerparcial.excuse.typeexcuse.impl;

import com.primerparcial.excuse.Excuse;
import com.primerparcial.excuse.typeexcuse.ModerateExcuse;

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
