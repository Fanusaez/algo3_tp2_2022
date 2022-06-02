package edu.fiuba.algo3.modelo;

public class Posicion {
    private int posX;
    private int posY;
    private int ultimaPosX;
    private int ultimaPosY;

    public Posicion(int posX, int posY) {
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
        return this.ultimaPosX;
    }

    public int obtenerUltimaPosY(){
        return this.ultimaPosY;
    }

    public void establecerPosX(int posX) {
        this.ultimaPosX = posX;
        this.posX = posX;
    }

    public void establecerPosY(int posY) {
        this.ultimaPosY = posY;
        this.posY = posY;
    }

    public void setPos(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
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

}
