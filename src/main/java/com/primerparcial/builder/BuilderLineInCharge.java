package com.primerparcial.builder;

import com.primerparcial.chain.InCharge;
import com.primerparcial.chain.impl.*;

public class BuilderLineInCharge implements Builder{
    private LineInCharge result;
    private InCharge head;
    private InCharge tail;

    public BuilderLineInCharge() {
        result = new LineInCharge();
    }

    public void addHandler( InCharge inCharge ){
        if( inCharge != null ){
            head = inCharge;
            tail = inCharge;
        }else{
            this.tail.setHandler(inCharge);
            tail = inCharge;
        }
    }

    public void addAreaSupervisor(AreaSupervisor inCharge){
        this.addHandler(inCharge);
    }

    public void addReceptionist(Receptionist inCharge){
        this.addHandler(inCharge);
    }
    public void addHumanResourcesManager(HumanResourcesManager inCharge){
        this.addHandler(inCharge);
    }
    public void addCEO(CEO inCharge){
        this.addHandler(inCharge);
    }
    public void addSpecializedManager(SpecializedManager inCharge){
        this.addHandler(inCharge);
    }
    @Override
    public void reset() {
        result = new LineInCharge();
        head = null;
        tail = null;
    }

    @Override
    public LineInCharge build() {
        this.result.addInCharge(head);
        return result;
    }
}
