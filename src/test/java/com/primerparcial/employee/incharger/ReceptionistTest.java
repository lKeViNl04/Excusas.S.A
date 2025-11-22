package com.primerparcial.employee.incharger;

import com.primerparcial.employee.incharge.InCharge;
import com.primerparcial.employee.incharge.Receptionist;
import com.primerparcial.excuse.typeexcuse.ImplausibleExcuse;
import com.primerparcial.excuse.typeexcuse.TrivialExcuse;
import com.primerparcial.excuse.typeexcuse.TypeExcuse;

public class ReceptionistTest extends InChargeTestBase{

    @Override
    protected InCharge createInCharge() {
        return new Receptionist("Receptionist test","Receptionist@gmail.com",1351L,mockStrategy);
    }

    @Override
    protected TypeExcuse getExcuseToHandle() {
        return new TrivialExcuse();
    }

    @Override
    protected TypeExcuse getExcuseToPass() {
        return new ImplausibleExcuse();
    }
}
