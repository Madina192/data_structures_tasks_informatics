package matrices;

import java.util.Scanner;

public class DTest {
    public static void main(String[] args) {
        taskD();
    }

    static void taskD(){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] arr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = scanner.nextInt();
            }
        }
        int minFirst = 0;
        int minSecond = 0;
        int maxFirst = 0;
        int maxSecond = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if(arr[i][j] < arr[minFirst][minSecond]) {
                    minFirst = i;
                    minSecond = j;
                } else if(arr[i][j] > arr[maxFirst][maxSecond]) {
                    maxFirst = i;
                    maxSecond = j;
                }
            }
        }
        System.out.println((minFirst + 1) + " " + (minSecond + 1) + " " + arr[minFirst][minSecond]);
        System.out.println((maxFirst + 1) + " " + (maxSecond + 1) + " " + arr[maxFirst][maxSecond]);
    }
}
