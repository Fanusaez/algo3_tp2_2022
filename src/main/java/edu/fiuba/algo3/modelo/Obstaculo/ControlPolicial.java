package edu.fiuba.algo3.modelo.Obstaculo;

import edu.fiuba.algo3.modelo.Vehiculos.Auto;
import edu.fiuba.algo3.modelo.Vehiculos.Moto;
import edu.fiuba.algo3.modelo.Vehiculos.TodoTerreno;
import edu.fiuba.algo3.modelo.Vehiculos.Vehiculo;


public class ControlPolicial implements Obstaculo{
    public int aplicarPenalizacion(Vehiculo vehiculo) {
        return vehiculo.incrementarMovimientos(this);
    }


    public int aplicarPenalizacion(Moto moto){
        int numero = (int) (Math.random() * 11 + 1); // numero entre 1 y 10
        if (numero <= 8) return 0; // prob de que esto pase == 0.2
        return 3;
    }


    public int aplicarPenalizacion(Auto auto) {
        int numero = (int) (Math.random() * 11 + 1); // numero entre 1 y 10
        if (numero <= 5) return 0; // prob de que esto pase == 0.5
        return 3;
    }


    public int aplicarPenalizacion(TodoTerreno todoTerreno) {
        int numero = (int) (Math.random() * 11 + 1); // numero entre 1 y 10
        if (numero <= 7) return 0; // prob de que esto pase == 0.7
        return 3;
    }


    public void accionar(Vehiculo vehiculo) {
        aplicarPenalizacion(vehiculo);
    }


}
