package game2;

public class Hiena implements Depredador{

    @Override
    public void acechar() {
        System.out.println("hiena acechar");
    }

    @Override
    public void atacar() {
        System.out.println("hiena atacar");
    }

    @Override
    public void comer() {
        System.out.println("hiena comer");
    }
}
