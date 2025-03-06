package EjercicioInterfaz2;

public class TestShape {
    public static void main(String[] args) {

        Rectangle rectangulo1 = new Rectangle(12,20);
        Circle circulo1= new Circle(20);
        Triangle triangulo1= new Triangle(10,20);

        System.out.println(rectangulo1.getArea());
        System.out.println(circulo1.getArea());
        System.out.println(triangulo1.getArea());
    }
}
