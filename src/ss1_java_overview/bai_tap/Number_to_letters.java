package ss1_java_overview.bai_tap;

import java.util.Scanner;
//NOT DONE YET

public class Number_to_letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number you want to read:");
        int number;
        String ones = null, tens, hundreds;
        number = sc.nextInt();
        if (number >= 0 && number < 10) {
            switch (number) {
                case 1:
                    ones = "one";
                    break;
                case 2:
                    ones = "two";
                    break;
                case 3:
                    ones = "three";
                    break;
                case 4:
                    ones = "four";
                    break;
                case 5:
                    ones = "five";
                    break;
                case 6:
                    ones = "six";
                    break;
                case 7:
                    ones = "seven";
                    break;
                case 8:
                    ones = "eight";
                    break;
                case 9:
                    ones = "nine";
                    break;
                case 0:
                    ones = "zero";
                    break;
            }
        }
        System.out.println(ones);
        if (number<20||number==10){
            switch (number){

            }
        }
    }
}
