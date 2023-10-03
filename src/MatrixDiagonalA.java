import java.util.Scanner;

public class MatrixDiagonalA {
    public static void main(String[] args) {
        taskA();
    }

    static void taskA() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j + 1 == n) {
                    array[i][j] = 1;
                } else if (i + j >= n) {
                    array[i][j] = 2;
                } else {
                    array[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
