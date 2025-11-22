package com.primerparcial.prontuario;

import com.primerparcial.employee.Employee;
import com.primerparcial.excuse.Excuse;

public class Prontuario {
    private Employee employee;
    private Excuse excuse;

    public Prontuario(Employee employee, Excuse excuse) {
        this.employee = employee;
        this.excuse = excuse;
    }

    @Override
    public String toString() {
        return "Prontuario{ "+ employee.toString() +
                ", " + excuse.toString() +
                '}';
    }
}
