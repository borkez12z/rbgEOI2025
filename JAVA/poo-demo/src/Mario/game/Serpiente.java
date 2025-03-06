package Mario.game;

public class Serpiente implements Depredador {

    @Override
    public void acechar(){
        System.out.println("Serpiente acechando");
    }

    @Override
    public void atacar(){
        System.out.println("Serpiente atacando");
    }

    @Override
    public void comer(){
        System.out.println("Serpiente comiendo");
    }
}
