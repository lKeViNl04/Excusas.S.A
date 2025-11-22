package com.primerparcial.excuse.typeexcuse;

import com.primerparcial.excuse.Excuse;
import com.primerparcial.email.EmailSender;

public abstract  class TypeExcuse {
    public void executeProcess (Excuse excuse, EmailSender emailSender){
        emailSender.sendEmail(
                getDestinationEmail(excuse),
                getOriginEmail(),
                getAffair(),
                getBody()
        );
    }

    protected String getDestinationEmail(Excuse excuse){
        return excuse.getEmployee().getEmail();
    }
    protected String getOriginEmail() {
        return "Excusas.S.A.@gmail.com";
    }

    protected abstract String getAffair();
    protected abstract String getBody();
    public abstract String toString();

    public boolean isTrivial() { return false; }
    public boolean isModerate() { return false; }
    public boolean isComplex() { return false; }
    public boolean isImplausible() { return false; }
}
