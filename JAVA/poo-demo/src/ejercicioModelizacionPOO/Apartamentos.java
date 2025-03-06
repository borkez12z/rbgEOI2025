package ejercicioModelizacionPOO;

public class Apartamentos extends Viviendas{

    double valoradministracion;

    public Apartamentos(int idinmueble, int area, String direccion, int numHabitaciones, int numBaños, double valoradministracion) {
        super(idinmueble, area, direccion, numHabitaciones, numBaños);
        this.valoradministracion = valoradministracion;
    }

    public double getValoradministracion() {
        return valoradministracion;
    }
}
