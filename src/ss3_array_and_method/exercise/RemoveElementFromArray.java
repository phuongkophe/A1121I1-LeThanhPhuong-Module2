package ss3_array_and_method.exercise;

import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
        int[] array = {2, 4, 6, 7, 8, 10};
        int index = -1;
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the element you want to remove from the array: ");
        x = sc.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                index = i;
                System.out.println("Element " + x + " has index " + index + " in the array");
                break;
            }
            if (index != -1) {
                for (int j = index; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                    System.out.println("Array after remove " + x);
                    for ( i = 0; i < array.length - 1; i++) {
                        System.out.println(array[i] + " ");
                    }
                }
            } else {
                System.out.println("Not found in array");
                break;
            }


        }
    }
}
