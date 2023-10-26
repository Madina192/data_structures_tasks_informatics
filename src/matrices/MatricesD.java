package matrices;

import java.util.Scanner;

public class MatricesD {
    public static void main(String[] args) {
        taskD();
    }

    static void taskD() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int min = array[0][0];
        int minFirstIndex = 1;
        int minSecondIndex = 1;
        int max = array[0][0];
        int maxFirstIndex = 1;
        int maxSecondIndex = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                    minFirstIndex = i + 1;
                    minSecondIndex = j + 1;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                    maxFirstIndex = i + 1;
                    maxSecondIndex = j + 1;
                }
            }
        }
        System.out.println(minFirstIndex + " " + minSecondIndex + " " + min);
        System.out.println(maxFirstIndex + " " + maxSecondIndex + " " + max);
    }
}


