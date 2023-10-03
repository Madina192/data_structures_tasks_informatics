import java.util.Arrays;
import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        taskN();
    }

    public static void taskN() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int r = scanner.nextInt();
        int[] reversedArray = new int[n];
        int position = n - r;
        int secondPosition = 0;
        for (int i = 0; i < n; i++) {
            if (i < r) {
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

