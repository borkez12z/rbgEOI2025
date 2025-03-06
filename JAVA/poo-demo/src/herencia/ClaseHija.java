package herencia;

public class ClaseHija extends SuperClase{
    public float u;
    public double v;

    public void m3(){
        System.out.println("M3");
    }
    public void m4(){
        System.out.println("M4");
    }

    @Override
    public void m1() {
        System.out.println("M1 redefinido");
    }
}
