package com.lm2a.polimorfismo;

public class Tiger extends Animal {

    @Override
    public void makeNoise() {
        System.out.println("Tigre haciendo Grrrrrrrr");
    }

    @Override
    public void eat() {
        System.out.println("Tigre comiendo un mono");
    }
}
