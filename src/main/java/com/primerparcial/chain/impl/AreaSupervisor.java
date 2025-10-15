package com.primerparcial.chain.impl;

import com.primerparcial.chain.InCharge;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.excuse.type.TrivialExcuse;
import com.primerparcial.strategy.Strategy;

public class AreaSupervisor extends InCharge {


    protected AreaSupervisor(String name, String email, Long legajo, Strategy strategy) {
        super(name, email, legajo, strategy);
    }

    @Override
    public boolean processTypeDefault(){ return true; }

}
