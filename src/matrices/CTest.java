package matrices;

import java.util.Scanner;

public class CTest {
    public static void main(String[] args) {
        taskC();
    }
    static void taskC(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int k = scanner.nextInt();
        int r = scanner.nextInt();
        int numberOfEl = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                int current = arr[i][j];
                int step = 0;
                int sum = 0;
                while (current >= 1) {
                    step++;
                    sum += current % 10;
                    current /= 10;
                }
                if(step == k && sum % r == 0){
                    numberOfEl++;
                }
            }
        }
        System.out.println(numberOfEl);
    }
}
