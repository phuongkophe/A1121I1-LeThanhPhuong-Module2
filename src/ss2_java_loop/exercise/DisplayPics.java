package ss2_java_loop.exercise;

import java.util.Scanner;

public class DisplayPics {
    public static void main(String[] args) {
        int choice = -1;
        int choice2 = -1;
        Scanner input = new Scanner(System.in);
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle(The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    int height, width;
                    Scanner sc = new Scanner(System.in);
                    System.out.println("Enter height: ");
                    height = sc.nextInt();
                    System.out.println("Enter height: ");
                    width = sc.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = 1; j <= width; j++) {
                            System.out.print("* ");
                        }
                        System.out.println("");
                    }
                    break;
                case 2:
                    System.out.println("Choose the corner is square at");
                    System.out.println("1. Top-left");
                    System.out.println("2. Top-right");
                    System.out.println("3. Bottom-right");
                    System.out.println("4. Bottom-left");
                    choice2 = input.nextInt();
                    switch (choice2) {
                        case 4:
                            System.out.println("Enter height: ");
                            height = input.nextInt();
                            for (int i = 1; i <= height; i++) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 1:
                            System.out.println("Enter height: ");
                            height = input.nextInt();
                            for (int i = height; i >= 1; i--) {
                                for (int j = 1; j <= i; j++) {
                                    System.out.print("* ");
                                }
                                System.out.println("");
                            }
                            break;
                        case 3:
                            System.out.println("Enter height: ");
                            height = input.nextInt();
                            for (int i = 1; i <= height; i++) {
                                for (int j = 1; j <= height; j++) {
                                    if (j <= height - i) {
                                        System.out.print("   ");
                                    } else {
                                        System.out.print(" * ");
                                    }
                                }
                                System.out.println("");
                            }
                            break;
                        case 2:
                            System.out.println("Enter height: ");
                            height = input.nextInt();
                            for (int i = height; i >= 1; i--) {
                                for (int j = 1; j <= height; j++) {
                                    if (j <= height - i) {
                                        System.out.print("   ");
                                    } else {
                                        System.out.print(" * ");
                                    }
                                }
                                System.out.println("");
                            }
                            break;
                    }
                case 3:
                    System.out.println("Enter height: ");
                    height = input.nextInt();
                    for (int i = 1; i <= height; i++) {
                        for (int j = height; j > i; j--) {
                            System.out.print(" ");
                        }
                        for (int k = 1; k <= 2 * i - 1; k++) {
                            System.out.print('*');
                        }
                        System.out.println("");
                    }
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("No choice");
            }


        }
    }
}
