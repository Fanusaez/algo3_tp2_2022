package edu.fiuba.algo3;

import edu.fiuba.algo3.modelo.Jugador;
import edu.fiuba.algo3.modelo.Posicion;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJugador {

        @Test
        public void Test01SeCreaUnJugadorYElNombreEsElCorrecto(){
                Posicion posicion = new Posicion(5, 5);
                Jugador j1 = new Jugador("Felipe", posicion);
                assertEquals("Felipe", j1.obtenerNombre());
        }

        /*@Test
        public void Test02SeCreaUnJugadorYTieneUnVehiculo(){
                Posicion posicion = new Posicion(5, 5);
                Jugador j1 = new Jugador("Felipe", posicion);
                assertEquals(Vehiculo, j1.obtenerVehiculo());
        }*/

        @Test
        public void Test03JugadorSeMueveHaciaLaDerecha(){
                Posicion posicion = new Posicion(5, 5);
                Jugador j1 = new Jugador("Felipe", posicion);
                j1.moverDerecha();
                assertEquals(6, posicion.obtenerPosX());
        }




}
