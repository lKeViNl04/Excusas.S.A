package com.primerparcial;

import com.primerparcial.excuse.Excuse;
import com.primerparcial.excuse.type.TypeExcuse;

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

    public Excuse generateExcuse(TypeExcuse typeExcuse) {
        return new Excuse(this,typeExcuse);
    }


}
