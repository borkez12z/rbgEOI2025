package herencia.EjercicioVehiculo;

public class Automovil extends Vehiculo {
    public int numAsientos;
    public int numPuertas;

    public Automovil(int precioDia, String marcaModelo, int numllantas, int numAsientos, int numPuertas) {
        super(precioDia, marcaModelo, numllantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
    }

    public void mostrarDatos() {
        super.mostrarCaracteristicas();
        System.out.println("Numero de asientos: " + numAsientos+ " Numero de puertas: " + numPuertas);
    }

    public void pruebaDelMotor(){
        super.encenderMotor();
        super.apagarMotor();
    }
}
