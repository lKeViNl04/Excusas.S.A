package com.primerparcial.chain;

import com.primerparcial.Employee;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.strategy.Strategy;
import com.primerparcial.utils.EmailSender;

public abstract class InCharge extends Employee implements Handler{
    protected Strategy strategy;
    protected Handler next;

    protected InCharge(String name, String email, Long legajo, Strategy strategy) {
        super(name,email,legajo);
        this.strategy = strategy;
        this.next = null;
    }

    public void setStrategy(Strategy strategy) {this.strategy = strategy;}

    public void setHandler(Handler next) {this.next = next;}

    public void nextHandlerExcuse(Excuse excuse, EmailSender emailSender) {
        this.next.handlerExcuse(excuse,emailSender);
    }
    public void handlerExcuse(Excuse excuse, EmailSender emailSender) {
        if (canHandleExcuse(excuse)) {
            this.strategy.handlerExcuse(this,excuse,emailSender);
        }else{
            nextHandlerExcuse(excuse,emailSender);
        }
    }

    public void processExcuse(Excuse excuse, EmailSender emailSender) {
        excuse.getTypeExcuse().executeProcess(excuse, emailSender);
    }

    public boolean canHandleExcuse(Excuse excuse) {
        return excuse.getTypeExcuse().processType(this);
    }
    public boolean processTypeTrivial(){ return false; }
    public boolean processTypeModerate(){ return false; }
    public boolean processTypeImplausible(){ return false; }
    public boolean processTypeComplex(){ return false; }
}
