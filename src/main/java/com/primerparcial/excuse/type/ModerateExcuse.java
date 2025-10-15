package com.primerparcial.excuse.type;

import com.primerparcial.chain.InCharge;

public abstract class ModerateExcuse extends BaseTypeExcuse{
    @Override
    public boolean processType(InCharge inCharge) {
        return inCharge.processTypeDefault();
    }
}