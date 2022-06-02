package edu.fiuba.algo3.modelo;

import java.util.Random;

public class Grilla {

    private Object[][] grilla;
    private int cantEsquinasEjeX;
    private int cantEsquinasEjeY;
    private int tamanioEjeX;
    private int tamanioEjeY;


    static Random RNG = new Random();


    public Grilla(){
        this.asignarCantEsquinas();
        this.asignarTamaniosEjes();
        this.grilla = new Object[tamanioEjeX][tamanioEjeY];
    }

    public int obtenerCantEsquinasEjeX(){
        return this.cantEsquinasEjeX;
    }

    public int obtenerCantEsquinasEjeY(){
        return this.cantEsquinasEjeY;
    }

    public int obtenerTamanioEjeX(){
        return this.tamanioEjeX;
    }

    public int obtenerTamanioEjeY(){
        return this.tamanioEjeY;
    }

    public int obtenerCantTotalDePosiciones(){
        return this.tamanioEjeX * this.tamanioEjeY;
    }

    public void insertarObjetoEnPosicion(int posX, int posY, Object objeto){
        grilla[posX][posY] = objeto;
    }

    private void asignarCantEsquinas(){
        this.cantEsquinasEjeX = Grilla.conseguirCantEsquinasPorEje();
        this.cantEsquinasEjeY = Grilla.conseguirCantEsquinasPorEje();
    }

    private void asignarTamaniosEjes(){
        this.tamanioEjeX = (this.cantEsquinasEjeX * 3) + 2;
        this.tamanioEjeY = (this.cantEsquinasEjeY * 3) + 2;
    }


    private static int conseguirCantEsquinasPorEje(){
        return RNG.nextInt(Constantes.cantidadMaximaDeEsquinasPorEje - Constantes.cantidadMinimaDeEsquinasPorEje) + Constantes.cantidadMinimaDeEsquinasPorEje;
    }

}
