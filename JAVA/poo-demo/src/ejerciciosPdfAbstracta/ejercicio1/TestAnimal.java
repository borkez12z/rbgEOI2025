package ejerciciosPdfAbstracta.ejercicio1;

public class TestAnimal {
    public static void main(String[] args) {
        Lion leon = new Lion();
        Tiger tiger = new Tiger();

        animal[] animals={leon,tiger};
        for (animal a:animals){
            a.sound();
        }
    }
}
