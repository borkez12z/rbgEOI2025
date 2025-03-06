package com.lm2a.itf;

public interface Manejable {
    void detener();
    void arrancar();
    int acelerar(int aceleracion);
    void doblar(int angulo);
    int getVelocidad();
}
