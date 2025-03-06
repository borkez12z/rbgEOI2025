package herencia.EjercicioVehiculo;

public class Autobus extends Vehiculo {
    int numAsientos;
    int numPuertas;
    int numVentanillas;

    public Autobus(int precioDia, String marcaModelo, int numllantas, int numAsientos, int numPuertas, int numVentanillas) {
        super(precioDia, marcaModelo, numllantas);
        this.numAsientos = numAsientos;
        this.numPuertas = numPuertas;
        this.numVentanillas = numVentanillas;
    }

    public void mostrarDatos() {
        super.mostrarCaracteristicas();
        System.out.println("Numero Asientos: " + numAsientos+" Numero de Puertas " + numPuertas+ " Numero de ventanilla " +numVentanillas);
    }

    public void pruebasdelMotor(){
        super.encenderMotor();
        super.apagarMotor();
    }
}
