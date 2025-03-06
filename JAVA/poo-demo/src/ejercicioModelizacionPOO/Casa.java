package ejercicioModelizacionPOO;

public class Casa extends Viviendas{
    int nºpisos;

    public Casa(int idinmueble, int area, String direccion, int numHabitaciones, int numBaños, int nºpisos) {
        super(idinmueble, area, direccion, numHabitaciones, numBaños);
        this.nºpisos = nºpisos;
    }

    public int getNºpisos() {
        return nºpisos;
    }

}
