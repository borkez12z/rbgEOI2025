package com.lm2a.itf;

public class Lancha implements Manejable {
    private String modelo;

    public Lancha(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public void detener() {

    }

    @Override
    public void arrancar() {

    }

    @Override
    public int acelerar(int aceleracion) {
        return 0;
    }

    @Override
    public void doblar(int angulo) {

    }

    @Override
    public int getVelocidad() {
        return 0;
    }
}
