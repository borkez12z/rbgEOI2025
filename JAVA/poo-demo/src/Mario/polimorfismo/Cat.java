package com.lm2a.polimorfismo;

public class Cat extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Miauuuu");
    }

    @Override
    public void eat() {
        System.out.println("Gato comiendo pienso");
    }
}
