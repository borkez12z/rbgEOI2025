package ejerciciosPdfAbstracta.Ejercicio2;

public class Triangle extends Shape{

    double base;
    double altura;

    public Triangle(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    double calculateArea() {
        System.out.print("Area of Triangle: ");
        return base*altura;
    }

    @Override
    double calculatePerimeter() {
        System.out.print("Perimeter of Triangle: ");
        return base*2*altura;
    }
}
