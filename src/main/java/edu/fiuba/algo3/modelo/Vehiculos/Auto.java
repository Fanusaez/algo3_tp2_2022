package edu.fiuba.algo3.modelo.Vehiculos;

import edu.fiuba.algo3.modelo.Obstaculo.Obstaculo;

public class Auto implements Vehiculo{
    private int movimientos = 0;

    public void moverDerecha(){
    }

    public int incrementarMovimientos(Obstaculo obstaculo){
        int movimientosIncrementados = obstaculo.incrementarMovimientos(this);
        movimientos += movimientosIncrementados;
        return movimientosIncrementados;
    }

    @Override
    public int cantidadDeMovimientos() {
        return movimientos;
    }

    public void reducirMovimientosUnPorcentaje(int porcentaje){

    }
}
