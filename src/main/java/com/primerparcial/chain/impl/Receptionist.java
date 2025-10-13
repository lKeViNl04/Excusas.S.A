package com.primerparcial.chain.impl;

import com.primerparcial.chain.InCharge;
import com.primerparcial.strategy.Strategy;

public class Receptionist extends InCharge {

    protected Receptionist(String name, String email, Long legajo, Strategy strategy) {
        super(name, email, legajo, strategy);
    }

    @Override
    public boolean processTypeTrivial(){ return true; }

}


