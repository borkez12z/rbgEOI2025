import java.util.Scanner;
public class EjercicioNumeroMayor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce primer numero: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce segundo numero: ");
        int num2 = sc.nextInt();

        if (num1 > num2) {
            System.out.println("El primer numero es el mayor: " + num1);
        }else if (num1 < num2) {
            System.out.println("El segundo numero es el mayor: " + num2);
        }else{
            System.out.println("Los números son iguales ");
        }
        sc.close();
    }
}