package edu.fiuba.algo3.modelo;

import java.util.ArrayList;

public class Posicion {
    private int posX;
    private int posY;
    private int ultimaPosEnEsquinaX;
    private int ultimaPosEnEsquinaY;

    public Posicion(int posX, int posY) {
        // Crear excepcion para que ningun valor de la posicion pueda ser <= 0.
        this.posX = posX;
        this.posY = posY;
    }

    public int obtenerPosX() {
        return posX;
    }

    public int obtenerPosY() {
        return posY;
    }

    public int obtenerUltimaPosX(){
        return this.ultimaPosEnEsquinaX;
    }

    public int obtenerUltimaPosY(){
        return this.ultimaPosEnEsquinaY;
    }

    public void establecerPosX(int posX) {
        this.posX = posX;
        if (this.esMultiploDe3(posX)) ultimaPosEnEsquinaX = posX;
    }

    public void establecerPosY(int posY) {
        this.posY = posY;
        if (this.esMultiploDe3(posY)) ultimaPosEnEsquinaY = posY;
    }

    public void incrementarX(){
        this.establecerPosX(this.obtenerPosX() + Constantes.valorDeIncrementoDePosicion);
    }

    public void decrementarX(){
        this.establecerPosX(this.obtenerPosX() - Constantes.valorDeIncrementoDePosicion);
    }

    public void incrementarY(){
        this.establecerPosY(this.obtenerPosY() + Constantes.valorDeIncrementoDePosicion);
    }

    public void decrementarY(){
        this.establecerPosY(this.obtenerPosY() - Constantes.valorDeIncrementoDePosicion);
    }

    public void establecerEnUltimaPos(){
        this.establecerPosX(this.obtenerUltimaPosX());
        this.establecerPosY(this.obtenerUltimaPosY());
    }


    public static boolean posicionesCoincidenEnCoords(Posicion pos1, Posicion pos2){
        return (pos1.obtenerPosX() == pos2.obtenerPosX()) && (pos1.obtenerPosY() == pos2.obtenerPosY());
    }

    public ArrayList<Integer> obtenerPos(){
        ArrayList <Integer> pos = new ArrayList<Integer>();
        pos.add(posX);
        pos.add(posY);
        return pos;
    }

    public boolean estasEnEsquina(){
       return esMultiploDe3(posX) && esMultiploDe3(posY); // ver si funciona correctamente
    }

    private boolean esMultiploDe3(Integer num){
        return num % 3 == 0;
    }
}
