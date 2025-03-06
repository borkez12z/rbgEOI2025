package EjercicioInterfaz2;

public class Rectangle implements Shape {

    double ancho;
    double largo;

    public Rectangle(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    @Override
    public double getArea() {
        return ancho * largo;
    }
}
