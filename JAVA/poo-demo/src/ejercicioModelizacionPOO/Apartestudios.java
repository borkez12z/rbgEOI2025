package ejercicioModelizacionPOO;

public class Apartestudios extends Apartamentos{

    public Apartestudios(int idinmueble, int area, String direccion, int numhabitaciones, int numBaños, double valoradministracion) {
        super(idinmueble, area, direccion, 1, 1, valoradministracion);
    }

    public double valorcompra(){
        return area*150;
    }
}
