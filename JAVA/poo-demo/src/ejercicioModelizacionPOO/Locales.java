package ejercicioModelizacionPOO;

public class Locales extends Inmuebles{

    boolean Localizacion;

    public Locales(int idinmueble, int area, String direccion, boolean localizacion) {
        super(idinmueble, area, direccion);
        Localizacion = localizacion;
    }

    public boolean isLocalizacion() {
        if (Localizacion == true) {
            System.out.println("Localizacion Interna");
        }else{
            System.out.println("Localizacion Externa");
        }
        return Localizacion;
    }
}
