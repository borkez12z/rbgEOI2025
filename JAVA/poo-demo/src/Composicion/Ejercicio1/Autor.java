package Composicion.Ejercicio1;

public class Autor {

    String nombre;
    String email;
    char gender;

    public Autor(String nombre, String email, char gender) {
        this.nombre = nombre;
        this.email = email;
        this.gender = gender;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", gender=" + gender +
                '}';
    }
}
