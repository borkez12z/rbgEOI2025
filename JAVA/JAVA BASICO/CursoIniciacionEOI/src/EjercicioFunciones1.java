import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioFunciones1 {

    public static int sumar(ArrayList<Integer> numeros) {
        int suma = 0;
        for (Integer numero : numeros) {
            suma += numero;
        }
        return suma;
    }

    public static Double CalcularMedia(ArrayList<Integer> numeros) {
        double suma=sumar(numeros);
        return suma/numeros.size();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        int numero = 1;

        while(numero!=0){
            System.out.println("Introduzca un numero:");
            numero = sc.nextInt();
            numeros.add(numero);
        }

        int opcion;
        System.out.println("Seleccione una opción: ");
        System.out.println("1. Sumar");
        System.out.println("2. Media");
        opcion = sc.nextInt();

        if (opcion==1) {
            int suma = sumar(numeros);
            System.out.println("La suma es: " +suma);
        }else if (opcion==2) {
            double media= CalcularMedia(numeros);
            System.out.println("La media es:" +media);
        }else {
            System.out.println("Opcion no valida");
        }
    }
}
