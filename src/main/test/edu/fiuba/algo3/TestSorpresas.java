package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.Accionable;
import edu.fiuba.algo3.modelo.Sorpresa.Favorable;
import edu.fiuba.algo3.modelo.Vehiculos.Moto;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestSorpresas {
    @Test
    public void Test01MotoPisaUnaSorpresaFavorableSinNingunMovimiento(){
        Vehiculo moto = new Moto();
        Accionable favorable = new Favorable();
        favorable.accionar(moto);
        assertEquals(0, moto.cantidadDeMovimientos());
    }

    @Test
    public void Test02MotoPisaUnaSorpresaFavorableDespuesDeHacer10Movimientos(){
        Moto moto = new Moto();
        moto.setearCantidadDeMovimientos(10);
        Accionable favorable = new Favorable();
        favorable.accionar(moto);
        assertEquals(8, moto.cantidadDeMovimientos());
    }



}
