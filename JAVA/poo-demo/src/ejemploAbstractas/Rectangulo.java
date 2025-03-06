package ejemploAbstractas;

public class Rectangulo extends Forma{

    double largo;
    double ancho;

    public Rectangulo(String nombre, String color, double largo, double ancho) {
        super(nombre, color);
        this.largo = largo;
        this.ancho = ancho;
    }

    @Override
    public double calcularArea() {
        return largo*ancho;
    }
}
