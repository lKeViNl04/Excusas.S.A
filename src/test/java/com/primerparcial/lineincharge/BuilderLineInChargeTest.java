package com.primerparcial.lineincharge;

import com.primerparcial.employee.incharge.AreaSupervisor;
import com.primerparcial.employee.incharge.Handler;
import com.primerparcial.employee.incharge.InCharge;
import com.primerparcial.employee.incharge.SpecializedManager;
import com.primerparcial.strategy.Normal;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class BuilderLineInChargeTest {

    @Test
    @DisplayName("build() debe verificarse si se creo la linea de encargado")
    void buildLineInChargeCorrect() {
        BuilderLineInCharge builder = new BuilderLineInCharge();
        AreaSupervisor supervisor = new AreaSupervisor("brian", "brain@gmail.com", 152346L, new Normal());
        builder.addAreaSupervisor(supervisor);
        LineInCharge lineInCharge = builder.build();

        InCharge inChargeFirst = lineInCharge.getInCharge();
        assertNotNull(inChargeFirst,"No se creo la linea de encargado");
        assertInstanceOf(AreaSupervisor.class,inChargeFirst,"el primer encargado debe ser AreaSupervisor");
        assertEquals(152346L,inChargeFirst.getLegajo(),"el primer encargado debe tener el legajo 152346");

        Handler inChargeSecond = inChargeFirst.getNextHandler();
        assertNotNull(inChargeSecond, "no se creo la linea de encargado");
        assertInstanceOf(SpecializedManager.class,inChargeSecond, "el ultimo encargado debe ser SpecializedManager");
    }
}
