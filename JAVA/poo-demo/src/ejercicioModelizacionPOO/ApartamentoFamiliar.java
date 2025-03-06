package ejercicioModelizacionPOO;

public class ApartamentoFamiliar  extends Apartamentos{


    public ApartamentoFamiliar(int idinmueble, int area, String direccion, int numHabitaciones, int numBaños, double valoradministracion) {
        super(idinmueble, area, direccion, numHabitaciones, numBaños, valoradministracion);
    }

    public double valorcompra(){
        return area*200;
    }
}
