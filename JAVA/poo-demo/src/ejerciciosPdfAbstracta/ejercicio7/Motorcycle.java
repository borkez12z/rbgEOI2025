package ejerciciosPdfAbstracta.ejercicio7;

public class Motorcycle extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Motorcycle starting engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Motorcycle stopping engine");
    }
}
