package com.lm2a.polimorfismo;

public class Animal {

    private String picture;
    private String food;
    private boolean hunger;
    private String boundaries;
    private String location;

    public void makeNoise(){
        System.out.println("Animal haciendo algun sonido");
    }

    public void eat(){
        System.out.println("Animal comiendo");
    }

    public void sleep(){
        System.out.println("Animal durmiendo");
    }

    public void roam(){
        System.out.println("Animal vagando");
    }

}
