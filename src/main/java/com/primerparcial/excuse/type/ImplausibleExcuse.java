package com.primerparcial.excuse.type;

import com.primerparcial.chain.InCharge;

public class ImplausibleExcuse extends BaseTypeExcuse{

    public ImplausibleExcuse() {
        super();
    }

    @Override
    public boolean processType(InCharge inCharge) {
        return inCharge.processTypeDefault();
    }

    @Override
    protected String getAffair() {
        return "Approved for creativity";
    }

    @Override
    protected String getBody() {
        return "good imagination crack";
    }
}
