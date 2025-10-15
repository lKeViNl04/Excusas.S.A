package com.primerparcial.excuse.type;

import com.primerparcial.excuse.Excuse;
import com.primerparcial.utils.EmailSender;

public abstract  class BaseTypeExcuse implements TypeExcuse {
    @Override
    public void executeProcess (Excuse excuse, EmailSender emailSender){
        emailSender.sendEmail(
                getDestinationEmail(excuse),
                getOriginEmail(),
                getAffair(),
                getBody()
        );
    };

    protected String getDestinationEmail(Excuse excuse){
        return excuse.getEmployee().getEmail();
    }
    protected String getOriginEmail() {
        return "Excusas.S.A.@gmail.com";
    }

    protected abstract String getAffair();
    protected abstract String getBody();

}
