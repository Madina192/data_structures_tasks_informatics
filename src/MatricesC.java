import java.util.Scanner;

public class MatricesC {
    public static void main(String[] args) {
        taskC();
    }
    static void taskC(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] array = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        int r = scanner.nextInt();
        int numberOfElements = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int sumOfDigits = 0;
                int numberOfDigits = 0;
                while (array[i][j] > 0) {
                    sumOfDigits += array[i][j] % 10;
                    array[i][j] = array[i][j] / 10;
                    numberOfDigits++;
                }
                if(numberOfDigits == k && sumOfDigits % r == 0) {
                    numberOfElements++;
                }
            }
        }
        System.out.println(numberOfElements);
    }
}
