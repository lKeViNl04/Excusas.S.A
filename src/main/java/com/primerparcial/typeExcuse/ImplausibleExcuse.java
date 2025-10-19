package com.primerparcial.typeExcuse;

public class ImplausibleExcuse extends TypeExcuse{

    public ImplausibleExcuse() {
        super();
    }

    @Override
    public boolean isImplausible() { return true; }

    @Override
    protected String getAffair() {
        return "Approved for creativity";
    }

    @Override
    protected String getBody() {
        return "good imagination crack";
    }
}
