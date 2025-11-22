package com.primerparcial.strategy;

import com.primerparcial.employee.incharge.InCharge;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.email.EmailSender;

public interface Strategy {
    public void handlerExcuse(InCharge inCharge, Excuse excuse, EmailSender emailSender);
}
