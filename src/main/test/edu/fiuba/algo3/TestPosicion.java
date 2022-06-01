package edu.fiuba.algo3;

import org.junit.jupiter.api.Test;
import edu.fiuba.algo3.modelo.Vehiculos.Moto;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;
import edu.fiuba.algo3.modelo.Jugador;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPosicion {


    @Test
    public void Test01MotoSeMueveHaciaLaDerechaYSeIncrementaLaPosicionX(){
        Vehiculo moto = new Moto();
        moto.posicionarVehiculo(3, 5);
        moto.moverDerecha();
        assertEquals(4, moto.obtenerPosX());
    }


    @Test
    public void Test02MotoSeMueveHaciaLaIzquierdaYSeDecrementaLaPosicionX(){
        Vehiculo moto = new Moto();
        moto.posicionarVehiculo(3, 5);
        moto.moverIzquierda();
        assertEquals(2, moto.obtenerPosX());
    }


    @Test
    public void Test03MotoSeMueveHaciaArribaYSeAumentaLaPosicionY(){
        Vehiculo moto = new Moto();
        moto.posicionarVehiculo(3, 5);
        moto.moverArriba();
        assertEquals(6, moto.obtenerPosY());
    }


    @Test
    public void Test04MotoSeMueveHaciaAbajoYSeDecrementaLaPosicionY(){
        Vehiculo moto = new Moto();
        moto.posicionarVehiculo(3, 5);
        moto.moverAbajo();
        assertEquals(4, moto.obtenerPosY());
    }


    @Test
    public void Test05LaPosicionEstablecidaEnXEsCorrecta(){
        Vehiculo moto = new Moto();
        moto.posicionarVehiculo(10, 5);
        assertEquals(10, moto.obtenerPosX());
    }


    @Test
    public void Test06LaPosicionEstablecidaEnYEsCorrecta(){
        Vehiculo moto = new Moto();
        moto.posicionarVehiculo(10, 5);
        assertEquals(5, moto.obtenerPosY());
    }


    @Test
    public void Test07LaUltimaPosicionEnXEsLaCorrecta(){
        Vehiculo moto = new Moto();
        moto.posicionarVehiculo(10, 5);
        moto.moverDerecha();
        assertEquals(10, moto.obtenerUltimaPosX());
    }


    @Test
    public void Test07LaUltimaPosicionEnYEsLaCorrecta(){
        Vehiculo moto = new Moto();
        moto.posicionarVehiculo(10, 5);
        moto.moverArriba();
        assertEquals(5, moto.obtenerUltimaPosY());
    }



}
