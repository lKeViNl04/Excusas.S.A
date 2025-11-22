package com.primerparcial.employee.incharger;

import com.primerparcial.employee.incharge.HumanResourcesManager;
import com.primerparcial.employee.incharge.InCharge;
import com.primerparcial.excuse.typeexcuse.ComplexExcuse;
import com.primerparcial.excuse.typeexcuse.ImplausibleExcuse;
import com.primerparcial.excuse.typeexcuse.TypeExcuse;

public class HumanResourcesManagerTest extends InChargeTestBase{
    @Override
    protected InCharge createInCharge() {
        return new HumanResourcesManager("HumanResourcesManager test","HumanResourcesManager@gmail.com",51531L,mockStrategy);
    }

    @Override
    protected TypeExcuse getExcuseToHandle() {
        return new ComplexExcuse();
    }

    @Override
    protected TypeExcuse getExcuseToPass() {
        return new ImplausibleExcuse();
    }
}
