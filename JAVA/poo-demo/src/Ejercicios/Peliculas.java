package Ejercicios;

public class Peliculas {

    private String titulo;
    private String rating;
    private String genero;

    public Peliculas(String titulo, String genero, String rating) {
        this.titulo = titulo;
        this.genero = genero;
        this.rating = rating;
    }

    public Peliculas() {
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void playIt(){
        System.out.println(titulo+ " se está reproduciendo");
    }
}
