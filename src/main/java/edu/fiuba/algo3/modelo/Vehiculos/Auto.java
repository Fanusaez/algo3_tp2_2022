package edu.fiuba.algo3.modelo.Vehiculos;

import edu.fiuba.algo3.modelo.Obstaculo.Obstaculo;

public class Auto extends Vehiculo{

    @Override
    public int incrementarMovimientos(Obstaculo obstaculo){
        int movimientosIncrementados = obstaculo.aplicarPenalizacion(this);
        movimientos += movimientosIncrementados;
        return movimientosIncrementados;
    }
}
