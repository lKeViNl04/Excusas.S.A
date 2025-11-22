package com.primerparcial.excuse;

import com.primerparcial.employee.Employee;
import com.primerparcial.excuse.typeexcuse.TypeExcuse;
import com.primerparcial.email.EmailSender;

public class Excuse implements IExcuse {
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

    @Override
    public String toString() {
        return "Excuse{" + "typeexcuse = " + typeExcuse + '}';
    }
}
