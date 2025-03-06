package ejercicioInterfaz6;

public class TestTriangulo {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle();
        Circle circle = new Circle();
        Triangle triangle = new Triangle();
        Rectangle rectangle2 = new Rectangle();


        Drawable[] drawables = {rectangle, circle, triangle, rectangle2};

        for (Drawable drawable : drawables) {
            drawable.draw();
        }

    }
}
