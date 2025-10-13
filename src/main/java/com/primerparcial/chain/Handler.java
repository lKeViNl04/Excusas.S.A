package com.primerparcial.chain;

import com.primerparcial.excuse.Excuse;
import com.primerparcial.utils.EmailSender;

public interface Handler {
    public void setHandler(Handler handler);
    public void handlerExcuse(Excuse excuse, EmailSender emailSender);
}
