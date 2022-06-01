package edu.fiuba.algo3.modelo.Vehiculos;

import edu.fiuba.algo3.modelo.Constantes;
import edu.fiuba.algo3.modelo.Obstaculo.Obstaculo;

public class TodoTerreno extends Auto{

    private int pozosComidos;

    @Override
    public int incrementarMovimientosSegunObstaculo(Obstaculo obstaculo){
        int movimientosIncrementados = obstaculo.aplicarPenalizacion(this);
        movimientos += movimientosIncrementados;

        return movimientosIncrementados;
    }

    public void darVuelta(){
        posicion.establecerEnUltimaPos();
    }

    public void comerPozo(){
        this.pozosComidos++;
    }

    public boolean seComioDemasiadosPozos(){
        return (pozosComidos % Constantes.cantidadDePozosParaAplicarPenalizacionTodoterreno) == 0;
    }

    public Vehiculo cambiarVehiculo(){
        return new Moto();
    }

}
