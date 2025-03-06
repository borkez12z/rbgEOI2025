package com.lm2a.polimorfismo;

public class Hippo extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("XXXXXXXXX");
    }

    @Override
    public void eat() {
        System.out.println("Hippo comiendo plantita acuatica");
    }
}
