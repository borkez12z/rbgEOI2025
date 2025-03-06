package ejercicioModelizacionPOO;

public class Inmuebles {

    int idinmueble;
    int area;
    String Direccion;

    public Inmuebles(int idinmueble, int area, String direccion) {
        this.idinmueble = idinmueble;
        this.area = area;
        Direccion = direccion;
    }

    public int getIdinmueble() {
        return idinmueble;
    }

    public int getArea() {
        return area;
    }

    public String getDireccion() {
        return Direccion;
    }
}
