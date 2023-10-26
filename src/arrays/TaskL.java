package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TaskL {
    public static void main(String[] args) {
        taskL();
    }

    public static void taskL() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int r = scanner.nextInt();
        int[] reversedArray = new int[n];
        int position = r;
        int secondPosition = 0;
        for (int i = 0; i < n; i++) {
            if (i < n - r) {
                reversedArray[i] = array[position];
                position++;
            } else {
                reversedArray[i] = array[secondPosition];
                secondPosition++;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}

