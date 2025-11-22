package com.primerparcial.employee.incharger;

import com.primerparcial.employee.incharge.CEO;
import com.primerparcial.employee.incharge.InCharge;
import com.primerparcial.excuse.typeexcuse.ImplausibleExcuse;
import com.primerparcial.excuse.typeexcuse.TrivialExcuse;
import com.primerparcial.excuse.typeexcuse.TypeExcuse;

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