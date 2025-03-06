package com.lm2a.polimorfismo;

public class PolimorfismoTest {

    public static void main(String[] args) {
        Animal[] animals = new Animal[5];

        animals[0] = new Cat();
        animals[1] = new Dog();
        animals[2] = new Wolf();
        animals[3] = new Lion();
        animals[4] = new Hippo();

        Cat gato = new Cat();
        gato.makeNoise();
        gato.eat();
        Dog perro = new Dog();
        perro.makeNoise();
        perro.eat();
        Wolf lobo = new Wolf();
        lobo.makeNoise();
        lobo.eat();
        Lion leon = new Lion();
        leon.makeNoise();
        leon.eat();
        Hippo hipo = new Hippo();
        hipo.makeNoise();
        hipo.eat();

        for(Animal animal: animals) {
            animal.makeNoise();
            animal.eat();
        }



        mostrarAnimalsNoise(new Snake());

    }

    public static void mostrarAnimalsNoise(Animal animal) {
        animal.makeNoise();
    }

}
