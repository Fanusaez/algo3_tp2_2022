package edu.fiuba.algo3.modelo.Vehiculos;

import edu.fiuba.algo3.modelo.Obstaculo.Obstaculo;
import edu.fiuba.algo3.modelo.Posicion;

public class Auto extends Vehiculo{

    public Auto(Posicion posInicial){
        this.posicion = posInicial;
    }

    @Override
    public int incrementarMovimientosSegunObstaculo(Obstaculo obstaculo){
        int movimientosIncrementados = obstaculo.aplicarPenalizacion(this);
        movimientos += movimientosIncrementados;

        return movimientosIncrementados;
    }

    public void darVuelta(){
        posicion.establecerEnUltimaPos();
    }

    public Vehiculo cambiarVehiculo(){
        return new TodoTerreno(this.posicion);
     }

}
