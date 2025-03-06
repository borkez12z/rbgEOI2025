package ejercicioModelizacionPOO;

public class CasaRural extends Casa{

    int distanciaCabeceraMunicipal;
    int altitudNivelMar;

    public CasaRural(int idinmueble, int area, String direccion, int numHabitaciones, int numBaños, int nºpisos, int distanciaCabeceraMunicipal, int altitudNivelMar) {
        super(idinmueble, area, direccion, numHabitaciones, numBaños, nºpisos);
        this.distanciaCabeceraMunicipal = distanciaCabeceraMunicipal;
        this.altitudNivelMar = altitudNivelMar;
    }

    public int getDistanciaCabeceraMunicipal() {
        return distanciaCabeceraMunicipal;
    }

    public int getAltitudNivelMar() {
        return altitudNivelMar;
    }

    public double valorcompra(){
        return area*150;
    }
}
