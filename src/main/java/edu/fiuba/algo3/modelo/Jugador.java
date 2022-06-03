package edu.fiuba.algo3.modelo;

import edu.fiuba.algo3.modelo.Vehiculos.Auto;
import edu.fiuba.algo3.modelo.Vehiculos.Moto;
import edu.fiuba.algo3.modelo.Vehiculos.TodoTerreno;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;

import java.util.Random;

public class Jugador{

    private String nombre;
    private Vehiculo vehiculo;

    public Jugador(String nombre, Posicion posInicialVehiculo){
        this.nombre = nombre;
        this.vehiculo = Vehiculo.obtenerVehiculoAlAzar(posInicialVehiculo);
    }

    public String obtenerNombre(){
        return this.nombre;
    }

    public Vehiculo obtenerVehiculo(){
        return this.vehiculo;
    }

    public void moverArriba(){
        this.obtenerVehiculo().moverArriba();
    }

    public void moverAbajo(){
        this.obtenerVehiculo().moverAbajo();
    }

    public void moverIzquierda(){
        this.obtenerVehiculo().moverIzquierda();
    }

    public void moverDerecha(){
        this.obtenerVehiculo().moverDerecha();
    }


}
