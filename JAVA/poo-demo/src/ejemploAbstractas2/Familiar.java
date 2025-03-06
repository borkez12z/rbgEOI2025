package ejemploAbstractas2;

public class Familiar extends Coche{

    public Familiar(String model, String color, int maxSpeed) {
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
