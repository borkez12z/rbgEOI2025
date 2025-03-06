package EjercicioInterfaz;

public class Coche implements Frenable{

    boolean frenos;
    int velocidad;

    @Override
    public void frenar() {
        System.out.println("El coche está frenando.....");
    }

    @Override
    public void soltarFreno() {
        System.out.println("Coche Soltando freno");
    }

    public int velocidad(int velocidad){
        return velocidad;
    }
}
