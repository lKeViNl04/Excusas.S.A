package com.primerparcial.excuse.type;

import com.primerparcial.chain.InCharge;

public class TrivialExcuse extends BaseTypeExcuse{

    public TrivialExcuse() {
        super();
    }

    @Override
    public boolean processType(InCharge inCharge) {
        return inCharge.processTypeDefault();
    }

    @Override
    protected String getAffair() {
        return "reason for delay";
    }

    @Override
    protected String getBody() {
        return "the license was accepted";
    }
}
