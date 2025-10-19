package com.primerparcial;

import com.primerparcial.Employee;
import com.primerparcial.typeExcuse.TypeExcuse;
import com.primerparcial.email.EmailSender;

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

    public void executeProcess(Excuse excuse , EmailSender emailSender) {
        this.typeExcuse.executeProcess(excuse , emailSender);
    }

    public boolean isTrivial(){ return this.typeExcuse.isTrivial(); }
    public boolean isImplausible(){ return this.typeExcuse.isImplausible(); }
    public boolean isComplex(){ return this.typeExcuse.isComplex(); }
    public boolean isModerate(){ return this.typeExcuse.isModerate(); }

}
