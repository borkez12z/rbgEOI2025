package ejercicioModelizacionPOO;

public class CasaIndependiente extends CasaUrbana{

    public CasaIndependiente(int idinmueble, int area, String direccion, int numHabitaciones, int numBaños, int nºpisos) {
        super(idinmueble, area, direccion, numHabitaciones, numBaños, nºpisos);
    }

    public double valorcompra(){
        return area*300;
    }
}
