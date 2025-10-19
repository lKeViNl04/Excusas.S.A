package com.primerparcial.inchargers;

import com.primerparcial.Excuse;

public interface Handler {
    public void setHandler(Handler handler);
    public void handlerExcuse(Excuse excuse);
}
