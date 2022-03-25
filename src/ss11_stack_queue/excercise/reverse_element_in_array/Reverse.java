package ss11_stack_queue.excercise.reverse_element_in_array;

import javax.swing.*;
import java.lang.reflect.Array;
import java.util.*;

public class Reverse {


    private static void reverseNum() {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter the length of array");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            Scanner scanner1 = new Scanner(System.in);
            System.out.println("Enter element " + i);
            stack.push(scanner.nextInt());
        }
        Integer[] reverse = new Integer[n];
        for (int i = 0; i < n; i++) {
            reverse[i] = stack.pop();
        }
        System.out.println(Arrays.toString(reverse));
    }

    private static void reverseStr() {
        Stack<Integer> stack = new Stack<>();
        System.out.println("Enter a String");
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        char[] chars = new char[string.length()];
        for (int i = 0; i < string.length(); i++ ){
            chars[i] = string.charAt(i);
//            string.charAt(i) =;
        }
    }

    public static void main(String[] args) {
        reverseNum();
    }
}
