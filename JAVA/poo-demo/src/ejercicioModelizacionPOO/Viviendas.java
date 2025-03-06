package ejercicioModelizacionPOO;

public class Viviendas extends Inmuebles{

    int numHabitaciones;
    int numBaños;

    public Viviendas(int idinmueble, int area, String direccion, int numHabitaciones, int numBaños) {
        super(idinmueble, area, direccion);
        this.numHabitaciones = numHabitaciones;
        this.numBaños = numBaños;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public int getNumBaños() {
        return numBaños;
    }
}
