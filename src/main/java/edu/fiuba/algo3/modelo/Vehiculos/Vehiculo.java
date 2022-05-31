package edu.fiuba.algo3.modelo.Vehiculos;

import edu.fiuba.algo3.modelo.Obstaculo.Obstaculo;

public interface Vehiculo {
    void moverDerecha();
    int incrementarMovimientos(Obstaculo obstaculo);
    void reducirMovimientosUnPorcentaje(int procentaje);

    //METODOS BASURA O DE PRUEBA
    int cantidadDeMovimientos();
}
