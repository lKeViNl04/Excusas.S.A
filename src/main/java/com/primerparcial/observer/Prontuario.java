package com.primerparcial.observer;

import com.primerparcial.Employee;
import com.primerparcial.excuse.Excuse;

public class Prontuario {
    private Employee employee;
    private Excuse excuse;

    public Prontuario(Employee employee, Excuse excuse) {
        this.employee = employee;
        this.excuse = excuse;
    }
}
