package com.lm2a.polimorfismo.alb;

public class DispositivoInteligente {

    private String memoria;
    private String cpu;
    private String disco;

    public void encender(){
        System.out.println("Encendiendo el dispositivo");
    }

    public void abrirAplicacion(Aplicacion aplicacion){
        aplicacion.arrancar();
    }

    public void cerrarAplicacion(Aplicacion aplicacion){
        aplicacion.detener();
    }

    public void apagar(){
        System.out.println("Apagando el dispositivo");
    }



}
