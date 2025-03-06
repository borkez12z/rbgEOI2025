package ejemploAbstractas2;

public class Electrico extends Coche{


    public Electrico(String model, String color, int maxSpeed) {
        super(model, color, maxSpeed);
    }

    @Override
    void acelerar() {
        System.out.println("Acelerando...");
    }

    @Override
    void frenar() {
        System.out.println("Frenando...");
    }
}
