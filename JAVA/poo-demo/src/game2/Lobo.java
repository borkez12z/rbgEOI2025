package game2;

public class Lobo implements Depredador{


    @Override
    public void acechar() {
        System.out.println("Lobo acechar");
    }

    @Override
    public void atacar() {
        System.out.println("Lobo atacar");
    }

    @Override
    public void comer() {
        System.out.println("Lobo comer");
    }
}
