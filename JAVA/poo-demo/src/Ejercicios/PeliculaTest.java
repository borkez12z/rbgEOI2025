package Ejercicios;

import java.util.Scanner;

public class PeliculaTest {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        Peliculas cadenaPerpetua= new Peliculas();
        System.out.println("Introduce Título:");
        cadenaPerpetua.setTitulo(sc.nextLine());
        System.out.println("Introduce Genero:");
        cadenaPerpetua.setGenero(sc.next());
        System.out.println("Introduce Rating:");
        cadenaPerpetua.setRating(sc.next());
        cadenaPerpetua.playIt();
        System.out.println("Genero: "+ cadenaPerpetua.getGenero()+ " Rating: "+cadenaPerpetua.getRating());

        Peliculas elPadrino= new Peliculas();
        elPadrino.setTitulo("El padrino");
        elPadrino.setGenero("Drama");
        elPadrino.setRating("9");
        elPadrino.playIt();

        Peliculas gladiator= new Peliculas();
        gladiator.setTitulo("Gladiator");
        gladiator.setGenero("Accion, aventura");
        gladiator.setRating("9");
        gladiator.playIt();

    }
}
