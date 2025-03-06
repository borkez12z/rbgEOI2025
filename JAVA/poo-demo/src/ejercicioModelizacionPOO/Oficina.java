package ejercicioModelizacionPOO;

public class Oficina extends Locales{

    boolean Gobierno;

    public Oficina(int idinmueble, int area, String direccion, boolean localizacion, boolean gobierno) {
        super(idinmueble, area, direccion, localizacion);
        Gobierno = gobierno;
    }

    public double valormetrocuadrado(){
        return area*350;
    }
}
