package com.primerparcial.typeExcuse;

import com.primerparcial.excuse.typeexcuse.ComplexExcuse;
import com.primerparcial.excuse.typeexcuse.TypeExcuse;

public class ComplexExcuseTest extends TypeExcuseTestBase{
    @Override
    protected TypeExcuse createTypeExcuse() {
        return new ComplexExcuse();
    }

    @Override
    protected String getExpectedAffair() {
        return "Excuse Complex";
    }

    @Override
    protected String getExpectedBody() {
        return "the license was accepted";
    }
}
