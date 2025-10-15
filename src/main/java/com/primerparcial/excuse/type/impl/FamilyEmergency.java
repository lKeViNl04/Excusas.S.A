package com.primerparcial.excuse.type.impl;

import com.primerparcial.excuse.Excuse;
import com.primerparcial.excuse.type.ModerateExcuse;
import com.primerparcial.utils.EmailSender;

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
