package ejemploAbstractas2;

public class Deportivo extends Coche{


    public Deportivo(String model, String color, int maxSpeed) {
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
