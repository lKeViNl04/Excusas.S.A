package com.primerparcial.typeExcuse.impl;

import com.primerparcial.typeExcuse.ModerateExcuse;

public class FamilyEmergency extends ModerateExcuse {
    public FamilyEmergency() {
        super();
    }

    @Override
    protected String getAffair() {
        return "concern to the employee";
    }

    @Override
    protected String getBody() {
        return "is everything okay?";
    }
}
