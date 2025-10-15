package com.primerparcial.builder;

import com.primerparcial.chain.InCharge;
import com.primerparcial.excuse.Excuse;
import com.primerparcial.utils.EmailSender;

public class LineInCharge {

    private InCharge inCharge;

    public LineInCharge() {
        this.inCharge = null;
    }

    public void addInCharge(InCharge inCharge) {
        this.inCharge = inCharge;
    }

    public void handlerExcuse(Excuse excuse) {
        this.inCharge.handlerExcuse(excuse);
    }
}
