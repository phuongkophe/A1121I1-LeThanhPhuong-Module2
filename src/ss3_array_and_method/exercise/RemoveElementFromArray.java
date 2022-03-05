package ss3_array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementFromArray {
    public static void main(String[] args) {
//        StopWatch stopWatch = new StopWatch();
//        stopWatch.start();
//        System.out.println("Thoi gian bat dau: " + stopWatch.getStartTime());
        Integer[] arr = {2, 1, 2, 2, 3, 4};
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập phần tử cần xóa: ");
        Integer itemDelete = scanner.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == itemDelete) {
                count++;
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                i--;
//                arr[arr.length - count] = 0;
            }
        }
        for (int i = 1; i <= count; i++) {
            arr[arr.length - i] = 0;
        }
        System.out.println(Arrays.toString(arr));
//        stopWatch.stop();
//        System.out.println("Thoi gian ket thuc: " + stopWatch.getEndTime());
//        System.out.println("Thoi gian chenh lech: " + stopWatch.getElapsedTime());
    }
}
