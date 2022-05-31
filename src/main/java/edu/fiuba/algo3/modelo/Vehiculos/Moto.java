package edu.fiuba.algo3.modelo.Vehiculos;

import edu.fiuba.algo3.modelo.Obstaculo.Obstaculo;

public class Moto extends Vehiculo{

    public void moverDerecha(){
    }

    @Override
    public int incrementarMovimientos(Obstaculo obstaculo){
        int movimientosIncrementados = obstaculo.aplicarPenalizacion(this);
        movimientos += movimientosIncrementados;
        return movimientosIncrementados;
    }

    public Vehiculo cambiar(){
        return new Auto();
    }
}
