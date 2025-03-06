package ejemploAbstractas;

public class TestForma {
    public static void main(String[] args) {

        Circulo circulo2= new Circulo(10,"Circulo","Verde");
        Rectangulo rectangulo= new Rectangulo("Rectangulo","Rojo",10,5);
        Triangulo triangulo= new Triangulo("Triangulo","Verde",10,20);

        System.out.println(circulo2.getNombre()+" "+circulo2.getColor()+" "+circulo2.calcularArea());
        System.out.println(rectangulo.getNombre()+" "+rectangulo.getColor()+" "+rectangulo.calcularArea());
        System.out.println(triangulo.getNombre()+" "+triangulo.getColor()+" "+triangulo.calcularArea());
    }
}
