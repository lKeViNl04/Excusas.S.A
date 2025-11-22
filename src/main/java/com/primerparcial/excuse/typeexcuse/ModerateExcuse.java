package com.primerparcial.excuse.typeexcuse;

public abstract class ModerateExcuse extends TypeExcuse{
    @Override
    public boolean isModerate() { return true; }
    @Override
    public String toString (){ return "ModerateExcuse"; }
}