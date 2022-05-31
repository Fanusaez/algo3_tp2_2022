package edu.fiuba.algo3.modelo.Vehiculos;

import edu.fiuba.algo3.modelo.Obstaculo.Obstaculo;

public class TodoTerreno extends Auto{
    @Override
    public int incrementarMovimientos(Obstaculo obstaculo){
        int movimientosIncrementados = obstaculo.aplicarPenalizacion(this);
        movimientos += movimientosIncrementados;
        return movimientosIncrementados;
    }
    public Vehiculo cambiar(){
        return new Moto();
    }
}
