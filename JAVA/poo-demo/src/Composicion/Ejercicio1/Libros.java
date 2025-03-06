package Composicion.Ejercicio1;

public class Libros {

    String titulo;
    Autor autor;
    double precio;
    int cantidad =0;

    public Libros(String titulo, Autor autor, double precio) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
    }

    public Libros(String titulo, Autor autor, double precio, int cantidad) {
        this.titulo = titulo;
        this.autor = autor;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    //public void setAutor(Autor autor) {
    //    this.autor = autor;
    //}

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }
    @Override

    public String toString() {
        return "Libros{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", precio=" + precio +
                ", cantidad=" + cantidad +
                '}';
    }
}
