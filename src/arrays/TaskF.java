package arrays;

import java.util.Scanner;

public class TaskF {
    public static void main(String[] args) {
        taskF();
    }

    public static void taskF() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int box = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (array[i] > array[j]) {
                    box = array[i];
                    array[i] = array[j];
                    array[j] = box;
                }
            }
        }
        System.out.print(array[0] + " " + array[1] + " " + array[2]);
    }
}