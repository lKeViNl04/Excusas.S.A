package com.primerparcial.excuse;

import com.primerparcial.Employee;
import com.primerparcial.chain.InCharge;
import com.primerparcial.excuse.type.TypeExcuse;
import com.primerparcial.utils.EmailSender;

public class Excuse {
    private Employee employee;
    private TypeExcuse typeExcuse;

    public Excuse(Employee employee, TypeExcuse typeExcuse) {
        this.employee = employee;
        this.typeExcuse = typeExcuse;
    }
    public Employee getEmployee() {
        return employee;
    }

    public boolean procesarType(InCharge inCharge) {
        return  this.typeExcuse.processType(inCharge);
    }

    public void executeProcess(Excuse excuse , EmailSender emailSender) {
        this.typeExcuse.executeProcess(excuse , emailSender);
    }
}
