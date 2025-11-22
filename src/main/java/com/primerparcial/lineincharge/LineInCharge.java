package com.primerparcial.lineincharge;

import com.primerparcial.excuse.Excuse;
import com.primerparcial.employee.incharge.InCharge;

public class LineInCharge {

    private InCharge inCharge;

    public LineInCharge() {
        this.inCharge = null;
    }

    public InCharge getInCharge() { return inCharge;}

    public void addInCharge(InCharge inCharge) {
        this.inCharge = inCharge;
    }

    public void handlerExcuse(Excuse excuse) {
        this.inCharge.handlerExcuse(excuse);
    }
}
