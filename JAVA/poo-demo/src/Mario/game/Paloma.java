package Mario.game;

public class Paloma implements Presa {

    @Override
    public void pasear(){
        System.out.println("Paloma paseando");
    }

    @Override
    public void comer(){
        System.out.println("Paloma comiendo");
    }

    @Override
    public void escapar(){
        System.out.println("Paloma escapando");
    }
}
