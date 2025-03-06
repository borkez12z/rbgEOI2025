package ejercicioInterfaz5;

public class TestResizable {
    public static void main(String[] args) {

        Rectangle rectangulo1= new Rectangle(20,40);
        Rectangle rectangulo2= new Rectangle(40,30);

        Rectangle[] rectangles = new Rectangle[]{rectangulo1,rectangulo2};
        for (Rectangle rectangle : rectangles) {
            rectangle.nuevasDimensiones();
        }
    }
}
