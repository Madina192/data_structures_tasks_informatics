package arrays;

import java.util.Scanner;

public class TaskB {
    public static void main(String[] args) {
        taskB();
    }

    public static void taskB() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int x = scanner.nextInt();
        boolean isThereAnyMatch = false;
        for (int i = 0; i < n; i++) {
            if (array[i] == x) {
                System.out.print(i + 1 + " ");
                isThereAnyMatch = true;
            }
        }
        if (!isThereAnyMatch) {
            System.out.print(-1);
        }
    }
}