package com.primerparcial.typeExcuse;

public class TrivialExcuse extends TypeExcuse{

    public TrivialExcuse() {
        super();
    }

    @Override
    public boolean isTrivial() { return true; }

    @Override
    protected String getAffair() {
        return "reason for delay";
    }

    @Override
    protected String getBody() {
        return "the license was accepted";
    }
}
