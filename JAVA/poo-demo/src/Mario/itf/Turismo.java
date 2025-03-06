package com.lm2a.itf;

public class Turismo implements Manejable {

    private int velocidad;

    @Override
    public void detener() {
        System.out.println("Deteniendo...");
        velocidad = 0;
    }

    @Override
    public void arrancar() {
        System.out.println("Arrancando...");
        velocidad = 10;
    }

    @Override
    public int acelerar(int aceleracion) {
        velocidad += aceleracion;
        System.out.println("Acelerando... Velocidad = " + velocidad);
        return velocidad;
    }

    @Override
    public void doblar(int angulo) {
        System.out.println("Vehiculo doblando ");
    }

    public int getVelocidad() {
        return velocidad;
    }


}
