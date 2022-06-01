package edu.fiuba.algo3.modelo.Vehiculos;

import edu.fiuba.algo3.modelo.Obstaculo.Obstaculo;

public class Auto extends Vehiculo{

    @Override
    public int incrementarMovimientosSegunObstaculo(Obstaculo obstaculo){
        int movimientosIncrementados = obstaculo.aplicarPenalizacion(this);
        movimientos += movimientosIncrementados;

        return movimientosIncrementados;
    }

    public void darVuelta(){
        posicion.setPos(posicion.getLastPosX(), posicion.getLastPosY());
    }

    public Vehiculo cambiarVehiculo(){
        return new TodoTerreno();
     }

}
