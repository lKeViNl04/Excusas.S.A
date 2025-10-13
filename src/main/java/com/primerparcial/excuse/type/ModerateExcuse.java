package com.primerparcial.excuse.type;

import com.primerparcial.chain.InCharge;

public abstract class ModerateExcuse implements TypeExcuse{
    @Override
    public boolean processType(InCharge inCharge) {
        return inCharge.processTypeModerate();
    }
}