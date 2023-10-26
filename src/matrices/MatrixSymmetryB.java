package matrices;

import java.util.Scanner;

public class MatrixSymmetryB {
    public static void main(String[] args) {
        taskB();
    }

    static void taskB() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int numberOfUnequal = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (array[i][j] != array[j][i]) {
                    numberOfUnequal++;
                }
            }
        }
        if (numberOfUnequal >= 1) {
            System.out.println("no");
        } else {
            System.out.println("yes");
        }
    }
}
