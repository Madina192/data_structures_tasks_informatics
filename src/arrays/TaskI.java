package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TaskI {
    public static void main(String[] args) {
        taskI();
    }

    public static void taskI() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int[] reversedArray = new int[n];
        int position = n - 1;
        for (int i = 0; i < n; i++) {
            reversedArray[i] = array[position];
            position -= 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
