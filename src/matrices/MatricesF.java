package matrices;

import java.util.Scanner;

public class MatricesF {
    public static void main(String[] args) {
        taskF();
    }

    static void taskF() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int max = array[0][0];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        for (int i=0; i<m; i++) {
            for (int j = 0; j < n; j++) {
                if (array[j][i] == max) {
                    for (int k = 0; k < n; k++) {
                        System.out.print(array[k][i] + " ");
                    }
                    System.out.println();
                }
            }
        }
    }
}