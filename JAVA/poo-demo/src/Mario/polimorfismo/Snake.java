package com.lm2a.polimorfismo;

public class Snake extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Sssssssss");
    }

    @Override
    public void eat() {
        System.out.println("Serpiente comiendo un raton");
    }
}
