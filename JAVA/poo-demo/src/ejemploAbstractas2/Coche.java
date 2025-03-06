package ejemploAbstractas2;

public abstract class Coche {

    String Model;
    String Color;
    int MaxSpeed;

    public Coche(String model, String color, int maxSpeed) {
        Model = model;
        Color = color;
        MaxSpeed = maxSpeed;
    }

    public String getModel() {
        return Model;
    }

    public int getMaxSpeed() {
        return MaxSpeed;
    }

    public String getColor() {
        return Color;
    }

    abstract void acelerar();
    abstract void frenar();
}
