package edu.fiuba.algo3.modelo.Vehiculos;

import edu.fiuba.algo3.modelo.Obstaculo.Obstaculo;

public abstract class Vehiculo {
    protected int movimientos;


    public void moverDerecha(){
    }

    public abstract int incrementarMovimientos(Obstaculo obstaculo);

    public void reducirMovimientosUnPorcentaje(double porcentaje) {
        movimientos = (int) (movimientos * porcentaje);
    }
    public void aumentarMovimientosUnPorcentaje(double porcentaje) {
        movimientos = (int) (movimientos * porcentaje);
    }

    public abstract Vehiculo cambiar();

    //Metodos para probar (Hay que crear fake objects despues)
    public int cantidadDeMovimientos(){return movimientos;}
    public void setearCantidadDeMovimientos(int cant){movimientos = cant;}

}
