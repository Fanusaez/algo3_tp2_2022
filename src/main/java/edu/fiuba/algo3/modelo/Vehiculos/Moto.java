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

    @Override
    public void reducirMovimientosUnPorcentaje(int porcentaje) {
        float coeficiente = (100 - (float)porcentaje) / 100;
        movimientos = (int) (movimientos * coeficiente);
    }


    //Metodos para probar (Hay que crear fake objects despues)
    public int cantidadDeMovimientos(){return movimientos;}
    public void setearCantidadDeMovimientos(int cant){movimientos = cant;}




}
