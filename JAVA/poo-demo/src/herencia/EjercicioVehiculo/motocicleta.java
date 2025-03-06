package herencia.EjercicioVehiculo;

public class motocicleta extends Vehiculo{

    int numAsientos;

    public motocicleta(int precioDia, String marcaModelo, int numllantas, int numAsientos) {
        super(precioDia, marcaModelo, numllantas);
        this.numAsientos = numAsientos;
    }

    public void mostrarDatos(){
        super.mostrarCaracteristicas();
        System.out.println("Numero de Asientos: " + numAsientos);
    }

    public void pruebaDelMotor(){
        super.encenderMotor();
        super.apagarMotor();
    }

}
