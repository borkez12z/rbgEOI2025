package herencia.EjercicioVehiculo;

public class Vehiculo {

    int precioDia;
    String marcaModelo;
    int numllantas;

    public Vehiculo(int precioDia, String marcaModelo, int numllantas) {
        this.precioDia = precioDia;
        this.marcaModelo = marcaModelo;
        this.numllantas = numllantas;
    }

    public void mostrarCaracteristicas() {
        System.out.println(toString());
    }

    public void encenderMotor(){
        System.out.println("Motor encendido");
    }

    public void apagarMotor(){
        System.out.println("Motor apagado");
    }

    public void funciona(){
        System.out.println("Funciona");
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "numllantas=" + numllantas +
                ", marcaModelo='" + marcaModelo + '\'' +
                ", precioDia=" + precioDia +
                '}';
    }
}
