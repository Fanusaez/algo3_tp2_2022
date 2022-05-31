package edu.fiuba.algo3.modelo.Vehiculos;

import edu.fiuba.algo3.modelo.Obstaculo.Obstaculo;

public class Moto implements Vehiculo{
    private int movimientos = 0;

    public void moverDerecha(){
    }

    public int incrementarMovimientos(Obstaculo obstaculo){
        int movimientosIncrementados = obstaculo.incrementarMovimientos(this);
        movimientos += movimientosIncrementados;
        return movimientosIncrementados;
    }


    //Metodos para probar (Hay que crear fake objects despues)
    public int cantidadDeMovimientos(){return movimientos;}

    @Override
    public void reducirMovimientosUnPorcentaje(int porcentaje) {
        movimientos = movimientos * (porcentaje / 100);
    }

}
