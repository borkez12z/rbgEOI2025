package EjerciciosPracticos;

import java.util.Scanner;

public class Ejercicio2DatosPersonales {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese el apellido: ");
        String apellido = sc.nextLine();
        System.out.print("Ingrese el edad: ");
        int edad = sc.nextInt();

        sc.nextLine();

        System.out.print("Ingrese el DNI: en formato 12345678A: ");
        String dni = sc.nextLine();

        int edadproximoano = edad +1;

        System.out.print("Nombre: "+nombre+ " Apellido " +apellido+ " edad "+edad+ " Dni: "+dni+"\n");
        System.out.print("El proximo año tendrá " + edadproximoano);
    }
}
