package ejercicioModelizacionPOO;

public class CasaUrbana extends Casa{

    double valoradministracion;

    public CasaUrbana(int idinmueble, int area, String direccion, int numHabitaciones, int numBaños, int nºpisos, double valoradministracion) {
        super(idinmueble, area, direccion, numHabitaciones, numBaños, nºpisos);
        this.valoradministracion = valoradministracion;
    }
}
