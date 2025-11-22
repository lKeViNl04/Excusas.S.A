package com.primerparcial.excuse.typeexcuse;

public class ComplexExcuse extends TypeExcuse {

    public ComplexExcuse() {
        super();
    }

    @Override
    public boolean isComplex() {
        return true;
    }

    @Override
    protected String getAffair() {
        return "Excuse Complex";
    }

    @Override
    protected String getBody() {
        return "the license was accepted";
    }

    @Override
    public String toString (){ return "ComplexExcuse"; }
}
