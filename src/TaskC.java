import java.util.Scanner;

public class TaskC {
    public static void main(String[] args) {
        taskC();
    }

    public static void taskC() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        int maxNum = array[0];
        for (int i = 0; i < n; i++) {
            if (array[i] > maxNum) {
                maxNum = array[i];
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (array[i] == maxNum) {
                count++;
            }
        }
        System.out.print(maxNum + " " + count);
    }
}
