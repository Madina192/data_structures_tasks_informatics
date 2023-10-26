package matrices;

import java.util.Scanner;

public class MatricesA {
    public static void main(String[] args) {
        taskA();
    }

    static void taskA(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int sumOfElements = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sumOfElements+=array[i][j];
            }

        }
        System.out.println(sumOfElements);
    }
}
