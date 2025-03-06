package EjercicioInterfaz2;

public class Triangle implements Shape{

    double base;
    double altura;

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double getArea() {
        return base*altura/2;
    }
}
