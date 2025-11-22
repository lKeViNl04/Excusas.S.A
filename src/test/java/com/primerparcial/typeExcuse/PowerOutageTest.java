package com.primerparcial.typeExcuse;

import com.primerparcial.excuse.typeexcuse.TypeExcuse;
import com.primerparcial.excuse.typeexcuse.impl.PowerOutage;

public class PowerOutageTest extends TypeExcuseTestBase {
    @Override
    protected TypeExcuse createTypeExcuse() {
        return new PowerOutage();
    }

    @Override
    protected String getExpectedAffair() {
        return "question about the blackout";
    }

    @Override
    protected String getExpectedBody() {
        return "was there a blackout in such neighborhood?";
    }
    // Sobrescribimos el método para el caso especial
    @Override
    protected String getExpectedDestinationEmail() {
        return "EDESUR@mailfake.com.ar";
    }
}