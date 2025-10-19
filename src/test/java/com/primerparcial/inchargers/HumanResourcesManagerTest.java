package com.primerparcial.inchargers;

import com.primerparcial.typeExcuse.ComplexExcuse;
import com.primerparcial.typeExcuse.ImplausibleExcuse;
import com.primerparcial.typeExcuse.TypeExcuse;

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
