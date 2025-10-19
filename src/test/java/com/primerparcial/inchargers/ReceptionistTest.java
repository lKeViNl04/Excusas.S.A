package com.primerparcial.inchargers;

import com.primerparcial.typeExcuse.ImplausibleExcuse;
import com.primerparcial.typeExcuse.TrivialExcuse;
import com.primerparcial.typeExcuse.TypeExcuse;

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
