import java.util.Random;

public class ArrayMultidimensional {
    public static void main(String[] args) {
        Random random = new Random();

        int[][] Matriz = new int[4][4];

        for(int i = 0; i < 4; i ++) {
            for(int j=0; j < 4; j++) {
                Matriz[i][j] = random.nextInt(9);
            }
        }

        System.out.println("Matriz:");
        for (int[] linha : Matriz) {
            for (int coluna : linha) {
                System.out.print(coluna + " ");
            }
        }
        
    }
}