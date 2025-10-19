package com.primerparcial.inchargers;

import com.primerparcial.typeExcuse.ImplausibleExcuse;
import com.primerparcial.typeExcuse.TrivialExcuse;
import com.primerparcial.typeExcuse.TypeExcuse;

public class CEOTest extends InChargeTestBase {

    @Override
    protected InCharge createInCharge() {
        return new CEO("CEO Test", "ceo@test.com", 99L, mockStrategy);
    }

    @Override
    protected TypeExcuse getExcuseToHandle() {
        return new ImplausibleExcuse();
    }

    @Override
    protected TypeExcuse getExcuseToPass() {
        return new TrivialExcuse();
    }
}