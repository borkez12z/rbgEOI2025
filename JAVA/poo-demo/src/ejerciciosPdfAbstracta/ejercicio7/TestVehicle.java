package ejerciciosPdfAbstracta.ejercicio7;

public class TestVehicle {
    public static void main(String[] args) {

        Car ferrari = new Car();
        Car benz = new Car();
        Motorcycle motorcycle = new Motorcycle();
        Motorcycle motorcycle2 = new Motorcycle();

        ferrari.startEngine();
        benz.stopEngine();
        motorcycle2.startEngine();
        motorcycle.stopEngine();

    }
}
