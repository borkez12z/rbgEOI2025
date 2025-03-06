package herencia.EjercicioVehiculo;

public class VehiculoTest {
    public static void main(String[] args) {
        motocicleta motocicleta=new motocicleta(20,"Ford",2,1);
        motocicleta.mostrarDatos();
        motocicleta.apagarMotor();

        Automovil automovil= new Automovil(10, "Nizan", 4,5,4);
        automovil.mostrarDatos();
        motocicleta.encenderMotor();

        Autobus autobus= new Autobus(15,"Volvo",6,60,2,10);
        autobus.mostrarDatos();
        motocicleta.apagarMotor();
    }
}
