package com.primerparcial.employee.incharge;

import com.primerparcial.excuse.Excuse;

public interface Handler {
    public void setHandler(Handler handler);
    public void handlerExcuse(Excuse excuse);
}
