package ejerciciosPdfAbstracta.Ejercicio2;

public class Circle extends Shape {

   double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        System.out.print("Area of a circle: ");
        return Math.PI * radius * radius;
    }

    @Override
    double calculatePerimeter() {
        System.out.print("Perimeter of a circle: ");
        return 2 * Math.PI * radius;
    }
}
