package edu.fiuba.algo3.modelo.Sorpresa;

import edu.fiuba.algo3.modelo.Accionable;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;

public class Desfavorable implements Sorpresa, Accionable{

    public void sorprender(Vehiculo vehiculo){
        vehiculo.aumentarMovimientosUnPorcentaje(1.25);
    }
    public void accionar(Vehiculo vehiculo) {
        sorprender(vehiculo);
    }


}
