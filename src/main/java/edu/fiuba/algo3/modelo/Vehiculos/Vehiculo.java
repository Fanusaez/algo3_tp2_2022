package edu.fiuba.algo3.modelo.Vehiculos;

import edu.fiuba.algo3.modelo.Constantes;
import edu.fiuba.algo3.modelo.Obstaculo.Obstaculo;
import edu.fiuba.algo3.modelo.Posicion;

import java.util.Random;

public abstract class Vehiculo {

    protected Posicion posicion;
    protected int movimientos;


    public void posicionarVehiculo(int posicionX, int posicionY){
        this.posicion = new Posicion(posicionX, posicionY);
    }

    public void moverArriba(){
        this.posicion.incrementarY();
    }

    public void moverAbajo(){
        this.posicion.decrementarY();
    }

    public void moverDerecha(){
        this.posicion.incrementarX();
    }

    public void moverIzquierda(){
        this.posicion.decrementarX();
    }


    public abstract int incrementarMovimientosSegunObstaculo(Obstaculo obstaculo);

    public void modificarMovimientosSegunFactor(double factor) {
        this.movimientos *= factor;
    }

    public abstract Vehiculo cambiarVehiculo();

    public static Vehiculo obtenerVehiculoAlAzar(){
        Random azar = new Random();
        if (azar.nextDouble() < Constantes.probabilidadDeObtenerUnaMoto){
            return new Moto();
        } else if (azar.nextDouble() < Constantes.probabilidadDeObtenerUnAuto){
            return new Auto();
        } else {
            return new TodoTerreno();
        }
    }

    //Metodos para probar (Hay que crear fake objects despues)
    public int cantidadDeMovimientos(){return movimientos;}
    public void setearCantidadDeMovimientos(int cant){movimientos = cant;}

}
