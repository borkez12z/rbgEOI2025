package EjercicioInterfaz;

public class Bicicleta implements Frenable{

    int marcha;
    int velocidad;
    boolean frenos;

    public void subirMarcha(){
        System.out.println("Subiendo marcha.....");

    }
    public void bajarMarcha(){
        System.out.println("Bajando marcha.....");

    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta está frenando.....");
    }

    @Override
    public void soltarFreno() {
        System.out.println("Bicicleta soltando freno");
    }

    public int getVelocidad() {
        return velocidad;
    }
}
