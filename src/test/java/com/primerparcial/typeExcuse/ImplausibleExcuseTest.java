package com.primerparcial.typeExcuse;

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