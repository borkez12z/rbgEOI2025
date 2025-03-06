package ejercicioInterfaz3;

public class Airplane implements Flyable{
    @Override
    public void fly_obj() {
        System.out.println("El avión está volando");
    }
}
