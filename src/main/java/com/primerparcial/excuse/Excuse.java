package com.primerparcial.excuse;

import com.primerparcial.Employee;
import com.primerparcial.excuse.type.TypeExcuse;

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
    public TypeExcuse getTypeExcuse() {
        return typeExcuse;
    }
}
