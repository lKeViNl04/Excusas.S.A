package com.primerparcial.employee;

import com.primerparcial.excuse.Excuse;
import com.primerparcial.excuse.typeexcuse.TypeExcuse;
import com.primerparcial.lineincharge.LineInCharge;

public abstract class Employee {

    private String name;
    private String email;
    private Long legajo;

    protected Employee(String name, String email, Long legajo) {
        this.name = name;
        this.email = email;
        this.legajo = legajo;
    }

    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public Long getLegajo() {
        return legajo;
    }

    public void generateExcuse(TypeExcuse typeExcuse) {
        LineInCharge lineInCharge = new LineInCharge();
        lineInCharge.handlerExcuse(new Excuse(this,typeExcuse));
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", legajo=" + legajo +
                '}';
    }
}
