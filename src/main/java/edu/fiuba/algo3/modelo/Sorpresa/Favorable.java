package edu.fiuba.algo3.modelo.Sorpresa;

import edu.fiuba.algo3.modelo.Accionable;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;

public class Favorable implements Sorpresa, Accionable {

    @Override
    public void sorprender(Vehiculo vehiculo){
        vehiculo.reducirMovimientosUnPorcentaje(20);
    }

    @Override
    public void accionar(Vehiculo vehiculo) {
       sorprender(vehiculo);
    }
}
