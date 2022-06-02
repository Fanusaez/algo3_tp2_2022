package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.Vehiculos.Moto;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPosicion {

    @Test
    public void Test01MotoSeMueveHaciaLaDerechaYSeIncrementaLaPosicionX(){
        Vehiculo moto = new Moto();
        moto.posicionarVehiculo(3, 5);
        moto.moverDerecha();

        Posicion posicion = new Posicion(4, 7);
        posicion.incrementarX();
        assertEquals(5,  posicion.obtenerPosX());
    }


    @Test
    public void Test02MotoSeMueveHaciaLaIzquierdaYSeDecrementaLaPosicionX(){
        Vehiculo moto = new Moto();
        moto.posicionarVehiculo(3, 5);
        moto.moverIzquierda();
    }


    @Test
    public void Test03MotoSeMueveHaciaArribaYSeAumentaLaPosicionY(){
        Vehiculo moto = new Moto();
        moto.posicionarVehiculo(3, 5);
        moto.moverArriba();
    }


    @Test
    public void Test04MotoSeMueveHaciaAbajoYSeDecrementaLaPosicionY(){
        Vehiculo moto = new Moto();
        moto.posicionarVehiculo(3, 5);
        moto.moverAbajo();
    }


    @Test
    public void Test05LaPosicionEstablecidaEnXEsCorrecta(){

    }


    @Test
    public void Test06LaPosicionEstablecidaEnYEsCorrecta(){

    }

}
