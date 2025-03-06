package Listas;

public class EjercicioMatriz3 {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j++) {
                if (i > 1) {
                    matriz[i][j] = 1;
                }else{
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
