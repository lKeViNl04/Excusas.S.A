package com.primerparcial.employee.incharge;

import com.primerparcial.excuse.Excuse;
import com.primerparcial.strategy.Strategy;

public class AreaSupervisor extends InCharge {


    public AreaSupervisor(String name, String email, Long legajo, Strategy strategy) {
        super(name, email, legajo, strategy);
    }

    @Override
    protected boolean canHandleExcuse(Excuse excuse) {
        return excuse.isModerate();
    }

}
