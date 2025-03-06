package EjerciciosPracticos;
import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introduzca el segundo numero: ");
        int num2 = sc.nextInt();

        int suma= num1 + num2;
        int resta= num1-num2;
        int multiplicacion= num1*num2;

        System.out.println("La suma de los numeros es: "+suma);
        System.out.println("La resta de los numeros es: "+resta);
        System.out.println("La multiplicacion de los numeros es: "+multiplicacion);


        if (num2!=0){
            int division= num1/num2;
            System.out.println("La division de los numeros es: "+division);
        }else{
            System.out.println("No se puede dividir entre 0");
        }
    }
}
