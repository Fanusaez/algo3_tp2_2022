package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.*;
import edu.fiuba.algo3.modelo.Obstaculo.Pozo;
import edu.fiuba.algo3.modelo.Sorpresa.Favorable;
import edu.fiuba.algo3.modelo.Vehiculos.Moto;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestObstaculos {
    @Test
    public void Test01MotoPisaUnPosoSeIncrementan3Movimientos(){
        Vehiculo moto = new Moto();
        Pozo pozo = new Pozo();
        pozo.accionar(moto);
        assertEquals(3, moto.cantidadDeMovimientos());
    }

    @Test
    public void Test02MotoPisaUnaSorpresaFavorable(){
        Vehiculo moto = new Moto();
        Accionable favorable = new Favorable();
        favorable.accionar(moto);
        assertEquals(0, moto.cantidadDeMovimientos());
    }

    @Test
    public void Tes03MotoPisaUnAccionablePozoYLeSuma3Movimientos(){
        Vehiculo moto = new Moto();
        Accionable pozo = new Pozo();
        pozo.accionar(moto);
        assertEquals(3, moto.cantidadDeMovimientos());
    }

    @Test
    public void Test04MotoPisaUnAccionablePozo2VecesYLeSuma6Movimientos(){
        Vehiculo moto = new Moto();
        Accionable pozo = new Pozo();
        pozo.accionar(moto);
        pozo.accionar(moto);
        assertEquals(6, moto.cantidadDeMovimientos());
    }


}

