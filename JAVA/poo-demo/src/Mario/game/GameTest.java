package Mario.game;

import java.util.Scanner;

public class GameTest {

    public static int BAMBI = 1;
    public static int CONEJITO = 2;
    public static int LOBO_FEROZ = 3;
    public static int HIENA = 4;

    public static void main(String[] args) {

//        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
//        System.out.println("Entre los personajes");
//        System.out.println("El primero: ");
//        System.out.println("1. Bambi");
//        System.out.println("2. Conejito");
//        int primero = myObj.nextInt();
//
//
//        System.out.println("El segundo: ");
//        System.out.println("3. Lobo Feroz");
//        System.out.println("4. Hiena");
//
//        int segundo = myObj.nextInt();

        Entorno entorno = new Entorno(new Serpiente(), new Conejito());
        entorno.jugar();
    }
}
