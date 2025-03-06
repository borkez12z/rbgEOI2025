package com.lm2a.polimorfismo;

public class Wolf extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Lobo haciendo Guauuuu");
    }

    @Override
    public void eat() {
        System.out.println("Lobo comiendo una ovejita");
    }
}
