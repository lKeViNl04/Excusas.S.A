package com.primerparcial.typeExcuse;

import com.primerparcial.excuse.typeexcuse.TypeExcuse;
import com.primerparcial.excuse.typeexcuse.impl.FamilyEmergency;

public class FamilyEmergencyTest extends TypeExcuseTestBase {
    @Override
    protected TypeExcuse createTypeExcuse() {
        return new FamilyEmergency();
    }

    @Override
    protected String getExpectedAffair() {
        return "concern to the employee";
    }

    @Override
    protected String getExpectedBody() {
        return "is everything okay?";
    }
}