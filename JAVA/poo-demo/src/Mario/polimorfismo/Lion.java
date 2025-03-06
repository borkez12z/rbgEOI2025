package com.lm2a.polimorfismo;

public class Lion extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Grrrrrrrr");
    }

    @Override
    public void eat() {
        System.out.println("Leon cominedo una gacela");
    }
}
