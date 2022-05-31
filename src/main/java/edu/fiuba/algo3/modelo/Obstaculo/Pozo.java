package edu.fiuba.algo3.modelo.Obstaculo;

import edu.fiuba.algo3.modelo.Accionable;
import edu.fiuba.algo3.modelo.Obstaculo.Obstaculo;
import edu.fiuba.algo3.modelo.Vehiculos.Auto;
import edu.fiuba.algo3.modelo.Vehiculos.Moto;
import edu.fiuba.algo3.modelo.Vehiculos.TodoTerreno;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;

public class Pozo implements Obstaculo, Accionable {

    public int incrementarMovimientos(Vehiculo vehiculo) {
        return vehiculo.incrementarMovimientos(this);
    }

    @Override
    public int incrementarMovimientos(Moto moto){
        return 3;
    }

    @Override
    public int incrementarMovimientos(Auto auto) {
        return 3;
    }

    @Override
    public int incrementarMovimientos(TodoTerreno todoTerreno) {
        // aca hay que ver como hacer para ver si lo penalizas (si tiene dos pozos cruzados) o no
        return 0;
    }

    @Override
    public void accionar(Vehiculo vehiculo) {
         incrementarMovimientos(vehiculo);
    }

}
