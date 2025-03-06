package ejerciciosPdfAbstracta.ejercicio6;

public class Sphere extends Shape3D{

   double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateVolume() {
        System.out.println("Calculating volume of sphere");
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    @Override
    double calculateSurfaceArea() {
        System.out.println("Calculating surface area");
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}
