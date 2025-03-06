import java.util.Scanner;

public class Ejercicio1Bucle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inicio, fin;

        do {
            System.out.print("Introduce el valor de inicio: ");
            inicio = scanner.nextInt();

            System.out.print("Introduce el valor de fin: ");
            fin = scanner.nextInt();

            if (fin <= inicio) {
                System.out.println("Tienes que poner valores correctos");
            }
        }while(fin <= inicio);

        while (inicio<=fin){
            System.out.println(inicio);
            inicio++;
        }

        scanner.close();
    }
}

