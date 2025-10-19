package com.primerparcial.inchargers;

import com.primerparcial.inchargers.InCharge;
import com.primerparcial.Excuse;
import com.primerparcial.strategy.Strategy;

public class HumanResourcesManager extends InCharge {

    protected HumanResourcesManager(String name, String email, Long legajo, Strategy strategy) {
        super(name, email, legajo, strategy);
    }

    @Override
    protected boolean canHandleExcuse(Excuse excuse) {
        return excuse.isComplex();
    }


}