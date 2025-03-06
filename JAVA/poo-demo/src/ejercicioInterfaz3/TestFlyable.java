package ejercicioInterfaz3;

public class TestFlyable {
    public static void main(String[] args) {

        Spacecraft nave=new Spacecraft();
        Airplane avion=new Airplane();
        Helicopter helicoptero=new Helicopter();

        Flyable[] flyables=new Flyable[] {nave,avion,helicoptero};
        for (Flyable flyable : flyables) {
            flyable.fly_obj();
        }
    }
}
