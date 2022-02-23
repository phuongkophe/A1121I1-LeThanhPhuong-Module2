package ss3_array_and_method.exercise;

import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 7, 8, 10};
        int index = 0;
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to remove from the array: ");
        x = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                index = i;
                System.out.println("Element " + x + " has index " + index + " in the array");
                break;
            } else {
                System.out.println("Not found in array");
            }
        }

        for (int j = index; j < array.length-1; j++) {
            array[j] = array[j + 1];
            array[array.length-2]=0;
        }
        System.out.println("Array after remove " + x);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
    }
}
