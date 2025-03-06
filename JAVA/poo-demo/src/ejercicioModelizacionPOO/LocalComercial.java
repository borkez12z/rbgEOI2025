package ejercicioModelizacionPOO;

public class LocalComercial extends Locales{

    String CentroComercial;

    public LocalComercial(int idinmueble, int area, String direccion, boolean localizacion, String centroComercial) {
        super(idinmueble, area, direccion, localizacion);
        CentroComercial = centroComercial;
    }

    public double valormetrocuadrado(){
        return area*300;
    }
}
