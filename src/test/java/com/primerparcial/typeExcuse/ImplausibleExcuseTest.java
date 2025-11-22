package com.primerparcial.typeExcuse;

import com.primerparcial.excuse.typeexcuse.ImplausibleExcuse;
import com.primerparcial.excuse.typeexcuse.TypeExcuse;

public class ImplausibleExcuseTest extends TypeExcuseTestBase {
    @Override
    protected TypeExcuse createTypeExcuse() {
        return new ImplausibleExcuse();
    }

    @Override
    protected String getExpectedAffair() {
        return "Approved for creativity";
    }

    @Override
    protected String getExpectedBody() {
        return "good imagination crack";
    }
}