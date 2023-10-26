package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TaskG {
    public static void main(String[] args) {
        taskG();
    }

    public static void taskG() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int box = 0;
        for (int i = 0; i < n - 1; i += 2) {
            box = array[i];
            array[i] = array[i + 1];
            array[i + 1] = box;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
