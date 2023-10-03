import java.util.ArrayList;
import java.util.Scanner;

public class TaskE {
    public static void main(String[] args) {
        taskE();
    }

    public static void taskE() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        ArrayList<Integer> positiveArray = new ArrayList();
        for (int i = 0; i < n; i++) {
            if (array[i] > 0 && array[i] % 2 == 0) {
                positiveArray.add(array[i]);
            }
        }
        if (positiveArray.size() > 0) {
            int maxNum = positiveArray.get(0);
            int minNum = positiveArray.get(0);
            for (int i = 0; i < positiveArray.size(); i++) {
                if (positiveArray.get(i) > maxNum) {
                    maxNum = positiveArray.get(i);
                }
            }
            for (int i = 0; i < positiveArray.size(); i++) {
                if (positiveArray.get(i) < minNum) {
                    minNum = positiveArray.get(i);
                }
            }
            System.out.print(minNum + " " + maxNum);
        } else {
            System.out.print(-1 + " " + -1);
        }
    }
}