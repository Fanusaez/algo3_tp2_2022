package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.Posicion;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestPosicion {

    @Test
    public void Test01IncrementoElValorDeLaPosicionEnX(){
        Posicion posicion = new Posicion(4, 7);
        posicion.incrementarX();
        assertEquals(5,  posicion.obtenerPosX());
    }


    @Test
    public void Test02DecrementoElValorDeLaPosicionEnX(){
        Posicion posicion = new Posicion(4, 7);
        posicion.decrementarX();
        assertEquals(3,  posicion.obtenerPosX());
    }


    @Test
    public void Test03IncrementoElValorDeLaPosicionEnY(){
        Posicion posicion = new Posicion(4, 7);
        posicion.incrementarY();
        assertEquals(8,  posicion.obtenerPosY());
    }


    @Test
    public void Test04DecrementoElValorDeLaPosicionEnY(){
        Posicion posicion = new Posicion(4, 7);
        posicion.decrementarY();
        assertEquals(6,  posicion.obtenerPosY());
    }


    @Test
    public void Test05LaPosicionEstablecidaEnXEsCorrecta(){
        Posicion posicion = new Posicion(4, 7);
        assertEquals(4,  posicion.obtenerPosX());
    }


    @Test
    public void Test06LaPosicionEstablecidaEnYEsCorrecta(){
        Posicion posicion = new Posicion(4, 7);
        assertEquals(7,  posicion.obtenerPosY());
    }

}
