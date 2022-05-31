package edu.fiuba.algo3.modelo.Obstaculo;

import edu.fiuba.algo3.modelo.Vehiculos.Auto;
import edu.fiuba.algo3.modelo.Vehiculos.Moto;
import edu.fiuba.algo3.modelo.Vehiculos.TodoTerreno;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;

public interface Obstaculo {
    int incrementarMovimientos(Vehiculo vehiculo);
    int incrementarMovimientos(Moto moto);
    int incrementarMovimientos(Auto auto);
    int incrementarMovimientos(TodoTerreno todoTerreno);
}
