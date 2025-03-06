package com.lm2a.itf;

public class ItfTest {

    public static void main(String[] args) {
        Cuatrox4 rover = new Cuatrox4();
        Moto harley = new Moto();
        Moto suzuki = new Moto();
        Turismo toyota = new Turismo();
        Cuatrox4 nissan = new Cuatrox4();

        Manejable[] manejables = new Manejable[5];

        manejables[0] = rover;
        manejables[1] = harley;
        manejables[2] = suzuki;
        manejables[3] = toyota;
        manejables[4] = nissan;

        for(Manejable m : manejables) {
            m.arrancar();
            System.out.println("La velocidad es: "+m.getVelocidad());
            m.acelerar(50);
            System.out.println("La velocidad es: "+m.getVelocidad());
            m.doblar(90);
        }
    }
}
