package com.primerparcial.inchargers;

import com.primerparcial.typeExcuse.ComplexExcuse;
import com.primerparcial.typeExcuse.TypeExcuse;
import com.primerparcial.typeExcuse.impl.PowerOutage; // Asumiendo que esta es una excusa moderada

public class AreaSupervisorTest extends InChargeTestBase {

    @Override
    protected InCharge createInCharge() {
        return new AreaSupervisor("Supervisor Test", "sup@test.com", 1L, mockStrategy);
    }

    @Override
    protected TypeExcuse getExcuseToHandle() {
        return new PowerOutage();
    }

    @Override
    protected TypeExcuse getExcuseToPass() {
        return new ComplexExcuse();
    }
}