package edu.fiuba.algo3.modelo;

public class Jugador{

    private String nombre;
    private Vehiculo vehiculo;

     public Jugador(){
         vehiculo = new Moto();
     }

     public static Jugador jugadorConMoto(){
         Jugador jugador = new Jugador();
         jugador.vehiculo = new Moto();
         return jugador;
     }
}
