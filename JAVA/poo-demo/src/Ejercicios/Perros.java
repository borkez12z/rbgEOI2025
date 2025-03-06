package Ejercicios;

public class Perros {

    private String size;
    private String raza;
    private String nombre;

    public Perros(String size, String raza, String nombre) {
        this.size = size;
        this.raza = raza;
        this.nombre = nombre;
    }

    public Perros() {
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void ladrar(){
        System.out.println(nombre+ " esta ladrando");
    }
}
