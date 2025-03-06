package com.lm2a.polimorfismo;

public class Dog extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Guauuuu");
    }

    @Override
    public void eat() {
        System.out.println("Perro comiendo pienso");
    }
}
