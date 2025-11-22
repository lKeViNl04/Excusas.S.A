package com.primerparcial.excuse.typeexcuse.impl;

import com.primerparcial.excuse.typeexcuse.ModerateExcuse;

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
