package ss2_java_loop.practice;

import java.util.Scanner;

public class Interest_calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        double money = sc.nextDouble();
        System.out.println("Enter number of month: ");
        int month = sc.nextInt();
        System.out.println("Enter annual interest rate  in percentage: ");
        double interestRate = sc.nextDouble();
        double totalInterest=0;
        for (int i =0;i<month;i++){
            totalInterest += money*(interestRate/100)/12*month;
        }
        System.out.println("Total of interest: "+totalInterest);
    }
}
