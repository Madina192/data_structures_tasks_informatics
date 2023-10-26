package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TaskJ {
    public static void main(String[] args) {
        taskJ();
    }

    public static void taskJ() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] reversedArray = new int[n];
        int leftPosition = n / 2 - 1;
        int rightPosition = n - 1;
        for (int i = 0; i < n; i++) {
            if (i < n / 2) {
                reversedArray[i] = array[leftPosition];
                leftPosition -= 1;
            } else {
                reversedArray[i] = array[rightPosition];
                rightPosition -= 1;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}

