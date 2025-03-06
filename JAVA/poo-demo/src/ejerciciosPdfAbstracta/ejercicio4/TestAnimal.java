package ejerciciosPdfAbstracta.ejercicio4;

public class TestAnimal {
    public static void main(String[] args) {

        Lion l = new Lion();
        Tiger t = new Tiger();
        Deer d = new Deer();
        Lion l1 = new Lion();
        Tiger t1 = new Tiger();
        Deer d1 = new Deer();

        Animal[] animals = {l,t,d,l1,t1,d1};
        for (Animal a : animals) {
            a.eat();
            a.sleep();
        }

    }
}
