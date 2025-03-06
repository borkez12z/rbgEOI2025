package ejerciciosPdfAbstracta.ejercicio7;

public class Car extends Vehicle {

    @Override
    void startEngine() {
        System.out.println("Car starting engine");
    }

    @Override
    void stopEngine() {
        System.out.println("Car stopping engine");
    }
}
