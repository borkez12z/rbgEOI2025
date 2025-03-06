package game2;

import java.util.Scanner;

public class TestAnimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Jugador 1: \n1. Conejo \n2. Bambi\n");
        int presa=sc.nextInt();
        System.out.println("Jugador 2: \n1. Lobo \n2. Hiena\n");
        int dep=sc.nextInt();

        Entorno entorno= new Entorno(presa, dep);
        entorno.jugar();


    }
}
