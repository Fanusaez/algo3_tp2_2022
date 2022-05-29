package edu.fiuba.algo3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestJugador {

        @Test
        public void Test01JugadorConMotoSeMueveHaciaLaDerecha(){
            Jugador jugador = new JugadorConMoto();
            jugador.mover_derecha();
            assertEquals(1, jugador.obtenerPosicionEnX());
        }


}
