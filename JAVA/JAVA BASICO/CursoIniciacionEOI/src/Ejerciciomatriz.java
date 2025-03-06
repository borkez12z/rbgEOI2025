public class Ejerciciomatriz {
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == 1 && (j == 1 || j == 2)){
                    matriz[i][j] = 1;
                } else if (i == 2 && (j == 1 || j == 2)) {
                    matriz[i][j] = 1;
                }
                else{
                    matriz[i][j] = 0;
                }
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

