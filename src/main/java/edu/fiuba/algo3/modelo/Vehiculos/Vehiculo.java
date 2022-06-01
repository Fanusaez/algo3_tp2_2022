package edu.fiuba.algo3.modelo.Vehiculos;

import edu.fiuba.algo3.modelo.Constantes;
import edu.fiuba.algo3.modelo.Obstaculo.Obstaculo;
import edu.fiuba.algo3.modelo.Posicion;

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


    //Metodos para probar (Hay que crear fake objects despues)
    public int cantidadDeMovimientos(){return movimientos;}
    public void setearCantidadDeMovimientos(int cant){movimientos = cant;}

    public int obtenerPosX(){
        return this.posicion.obtenerPosX();
    }
    public int obtenerPosY(){
        return this.posicion.obtenerPosY();
    }

    public int obtenerUltimaPosX(){
        return this.posicion.obtenerUltimaPosX();
    }

    public int obtenerUltimaPosY(){
        return this.posicion.obtenerUltimaPosY();
    }

}
