package com.primerparcial.excuse.type;

import com.primerparcial.chain.InCharge;

public class ComplexExcuse extends BaseTypeExcuse{

    public ComplexExcuse() {
        super();
    }

    @Override
    public boolean processType(InCharge inCharge) {
        return inCharge.processTypeDefault();
    }

    @Override
    protected String getAffair() {
        return "Excuse Complex";
    }

    @Override
    protected String getBody() {
        return "the license was accepted";
    }
}
