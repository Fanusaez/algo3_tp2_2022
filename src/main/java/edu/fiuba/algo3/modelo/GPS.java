package edu.fiuba.algo3.modelo;

import java.util.Scanner;

public class GPS {

    private Jugador jugador;
    private Ciudad ciudad;

    public GPS(){
        this.jugador = new Jugador(GPS.obtenerNombreJugador());
        this.ciudad = new Ciudad();
    }

    private static String obtenerNombreJugador() {
        Scanner lectorComandos = new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        return lectorComandos.nextLine();
    }

}
