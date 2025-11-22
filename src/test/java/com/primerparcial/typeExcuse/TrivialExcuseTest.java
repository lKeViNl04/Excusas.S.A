package com.primerparcial.typeExcuse;

import com.primerparcial.excuse.typeexcuse.TrivialExcuse;
import com.primerparcial.excuse.typeexcuse.TypeExcuse;

public class TrivialExcuseTest extends TypeExcuseTestBase {
    @Override
    protected TypeExcuse createTypeExcuse() {
        return new TrivialExcuse();
    }

    @Override
    protected String getExpectedAffair() {
        return "reason for delay";
    }

    @Override
    protected String getExpectedBody() {
        return "the license was accepted";
    }
}