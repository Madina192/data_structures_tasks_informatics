import java.util.ArrayList;
import java.util.Scanner;

public class TaskS {
    public static void main(String[] args) {
        taskS();
    }

    public static void taskS() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        ArrayList<Object> listOfNegativeNums = new ArrayList<>();
        boolean isThereAnyNegativeNum = false;
        for (int i = 0; i < n; i++) {
            if (array[i] < 0) {
                listOfNegativeNums.add(array[i]);
                isThereAnyNegativeNum = true;
            }
        }
        if (!isThereAnyNegativeNum) {
            System.out.println(0);
        } else {
            for (int i = 0; i < listOfNegativeNums.size(); i++) {
                System.out.print(listOfNegativeNums.get(i) + " ");
            }
        }
    }
}
