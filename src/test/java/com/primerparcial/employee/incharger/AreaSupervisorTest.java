package com.primerparcial.employee.incharger;

import com.primerparcial.employee.incharge.AreaSupervisor;
import com.primerparcial.employee.incharge.InCharge;
import com.primerparcial.excuse.typeexcuse.ComplexExcuse;
import com.primerparcial.excuse.typeexcuse.TypeExcuse;
import com.primerparcial.excuse.typeexcuse.impl.PowerOutage; // Asumiendo que esta es una excusa moderada

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