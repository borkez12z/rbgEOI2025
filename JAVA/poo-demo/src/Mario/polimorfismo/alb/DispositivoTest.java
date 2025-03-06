package com.lm2a.polimorfismo.alb;

public class DispositivoTest {
    public static void main(String[] args) {

        DispositivoInteligente[] dispositivoInteligentes = new DispositivoInteligente[5];

        dispositivoInteligentes[0] = new Movil();
        dispositivoInteligentes[1] = new Movil();
        dispositivoInteligentes[2] = new Portatil();
        dispositivoInteligentes[3] = new Portatil();
        dispositivoInteligentes[4] = new Portatil();

        for(DispositivoInteligente dispositivoInteligente : dispositivoInteligentes) {
            dispositivoInteligente.abrirAplicacion(new Aplicacion());
        }
    }
}
