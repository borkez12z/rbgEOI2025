package ejerciciosPdfAbstracta.ejercicio6;

public class TestShape3D {
    public static void main(String[] args) {

        Sphere sphere=new Sphere(50);

        System.out.println(sphere.calculateVolume());
        System.out.println(sphere.calculateSurfaceArea());
    }
}
