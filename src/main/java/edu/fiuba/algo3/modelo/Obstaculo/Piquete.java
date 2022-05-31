package edu.fiuba.algo3.modelo.Obstaculo;

import edu.fiuba.algo3.modelo.Accionable;
import edu.fiuba.algo3.modelo.Vehiculos.Auto;
import edu.fiuba.algo3.modelo.Vehiculos.Moto;
import edu.fiuba.algo3.modelo.Vehiculos.TodoTerreno;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;

public class Piquete implements Obstaculo, Accionable {

    public int aplicarPenalizacion(Vehiculo vehiculo) {
        return vehiculo.incrementarMovimientos(this);
    }


    public int aplicarPenalizacion(Moto moto){
        return 2;
    }


    public int aplicarPenalizacion(Auto auto) {
        // auto.darVuelta
        return 0;
    }


    public int aplicarPenalizacion(TodoTerreno todoTerreno) {
        // todoterreno.darvuelta
        return 0;
    }


    public void accionar(Vehiculo vehiculo) {
        aplicarPenalizacion(vehiculo);
    }

}
