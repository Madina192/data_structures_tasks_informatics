import java.util.Scanner;

public class SimpleStack {

    public static void main(String[] args) {
        int[] array = new int[10000];
        Scanner scanner = new Scanner(System.in);
        int sp = -1;
        boolean flag = true;
        //System.out.println();
        while (flag) {
            String methodName = scanner.next();
            switch (methodName) {
                case "push" -> {
                    int num = scanner.nextInt();
                    sp += 1;
                    array[sp] = num;
                    System.out.println("ok");
                    break;
                }
                case "pop" -> {
                    sp -= 1;
                    System.out.println(array[sp]);
                    break;
                }
                case "back" -> {
                    System.out.println(array[sp]);
                    break;
                }
                case "size" -> {
                    System.out.println(sp + 1);
                    break;
                }
                case "clear" -> {
                    sp = -1;
                    System.out.println("ok");
                    break;
                }
                case "exit" -> {
                    System.out.println("bye");
                    flag = false;
                }
            }
        }
    }
}
