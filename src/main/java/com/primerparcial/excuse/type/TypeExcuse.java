package com.primerparcial.excuse.type;

import com.primerparcial.chain.InCharge;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.utils.EmailSender;

public interface TypeExcuse {
    public boolean processType(InCharge inCharge);
    public void executeProcess (Excuse excuse, EmailSender emailSender);
}
