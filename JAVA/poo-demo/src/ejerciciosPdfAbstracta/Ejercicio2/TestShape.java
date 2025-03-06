package ejerciciosPdfAbstracta.Ejercicio2;

public class TestShape {
    public static void main(String[] args) {

        Circle circle = new Circle(13);
        Triangle triangle= new Triangle(10,16);

        Shape[] shapes={circle,triangle};
        for (Shape shape : shapes) {
            System.out.println(shape.calculateArea());
            System.out.println(shape.calculatePerimeter());
        }


    }
}
