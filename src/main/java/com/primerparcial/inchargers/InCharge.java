package com.primerparcial.inchargers;

import com.primerparcial.Employee;
import com.primerparcial.Excuse;
import com.primerparcial.strategy.Strategy;
import com.primerparcial.email.EmailSender;

public abstract class InCharge extends Employee implements Handler{
    protected Strategy strategy;
    protected Handler next;
    protected EmailSender emailSender;

    protected InCharge(String name, String email, Long legajo, Strategy strategy) {
        super(name,email,legajo);
        this.strategy = strategy;
        this.next = null;
        this.emailSender = new EmailSender();
    }

    public Handler getNextHandler() {return next;}

    public void setStrategy(Strategy strategy) {this.strategy = strategy;}

    public void setHandler(Handler next) {this.next = next;}

    public void nextHandlerExcuse(Excuse excuse) {
        this.next.handlerExcuse(excuse);
    }
    public void handlerExcuse(Excuse excuse) {
        if (canHandleExcuse(excuse)) {
            this.strategy.handlerExcuse(this,excuse, this.emailSender);
        }else{
            nextHandlerExcuse(excuse);
        }
    }

    public void processExcuse(Excuse excuse, EmailSender emailSender) {
        excuse.executeProcess(excuse, emailSender);
    }

    protected abstract boolean canHandleExcuse(Excuse excuse) ;
}
