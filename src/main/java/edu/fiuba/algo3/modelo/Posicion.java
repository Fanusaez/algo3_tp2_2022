package edu.fiuba.algo3.modelo;

public class Posicion {
    private int posX;
    private int posY;
    private int lastPosX;
    private int lastPosY;

    public Posicion(int posX, int posY) {
        this.posX = posX;
        this.posY = posY;
    }

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }

    public int getLastPosX(){
        return this.lastPosX;
    }

    public int getLastPosY(){
        return this.lastPosY;
    }

    public void setPosX(int posX) {
        this.lastPosX = posX;
        this.posX = posX;
    }

    public void setPosY(int posY) {
        this.lastPosY = posY;
        this.posY = posY;
    }

    public void setPos(int posX, int posY){
        this.posX = posX;
        this.posY = posY;
    }

}
