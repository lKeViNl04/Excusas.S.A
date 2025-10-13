package com.primerparcial.chain.impl;

import com.primerparcial.chain.InCharge;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.strategy.Strategy;
import com.primerparcial.utils.EmailSender;

public class HumanResourcesManager extends InCharge {

    protected HumanResourcesManager(String name, String email, Long legajo, Strategy strategy) {
        super(name, email, legajo, strategy);
    }

    @Override
    public boolean processTypeComplex(){ return true; }


}