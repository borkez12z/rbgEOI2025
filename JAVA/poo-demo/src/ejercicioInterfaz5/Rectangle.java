package ejercicioInterfaz5;

public class Rectangle implements Resizable{

    int width;
    int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void resizeWidth(int width) {
        this.width = width;
    }

    @Override
    public void resizeHeight(int height) {
        this.height = height;
    }

    public void nuevasDimensiones(){

        System.out.println("Ancho: " + this.width + " Largo: "+this.height);

    }
}
