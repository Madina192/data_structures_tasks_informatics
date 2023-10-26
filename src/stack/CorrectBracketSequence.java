package stack;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;

public class CorrectBracketSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        char[] array = inputString.toCharArray();
        boolean isSequenceCorrect = true;
        boolean isChecked = false;
        int sp = -1;
        int index = 0;
        // map
        for (int i = 0; i < array.length; i++) {
            if (array[i] == ')') {
                if (sp == -1) {
                    sp = i - 1;
                }
                if (array[sp] == '(') {
                    sp -= 1;
                } else {
                    isSequenceCorrect = false;
                    break;
                }
            } else if (array[i] == ']') {
                if (isChecked || sp == -1) {
                    sp = i - 1;
                }
                if (array[sp] == '[') {
                    sp -= 1;
                    if(sp == -1) {
                        isChecked = true;
                    }
                } else {
                    isSequenceCorrect = false;
                    break;
                }
            } else if (array[i] == '}') {
                sp = i - 1;
                if (array[sp] == '{') {
                    sp -= 1;
                } else {
                    isSequenceCorrect = false;
                    break;
                }
            }

        }
        if (isSequenceCorrect) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
        System.out.println(Arrays.toString(array));
    }
}