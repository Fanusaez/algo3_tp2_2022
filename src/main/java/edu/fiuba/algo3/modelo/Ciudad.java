package edu.fiuba.algo3.modelo;

import java.util.Random;

public class Ciudad {

    private int x;
    private int y;


    public Ciudad(){
        Random numAleatorio = new Random();
        x = numAleatorio.nextInt(Constantes.tamanioMaximoPorEjeDeGrillaDeCiudad + Constantes.tamanioMinimoPorEjeDeGrillaDeCiudad) + Constantes.tamanioMinimoPorEjeDeGrillaDeCiudad;
        y = numAleatorio.nextInt(Constantes.tamanioMaximoPorEjeDeGrillaDeCiudad + Constantes.tamanioMinimoPorEjeDeGrillaDeCiudad) + Constantes.tamanioMinimoPorEjeDeGrillaDeCiudad;
    }
}
