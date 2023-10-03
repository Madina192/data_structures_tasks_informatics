import java.util.Scanner;

public class StatisticsTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        n = 3 * n + 1;
        int numberOfLines = 0;
        System.out.println(n);
        while (n > 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else {
                n = 3 * n + 1;
            }
            System.out.println(n);
            numberOfLines++;
        }
        System.out.println("Number of lines: " + numberOfLines);
    }
}
