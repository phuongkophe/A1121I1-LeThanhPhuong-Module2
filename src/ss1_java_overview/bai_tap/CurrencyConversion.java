package ss1_java_overview.bai_tap;

import java.util.Scanner;

public class CurrencyConversion {
    public static void main(String[] args) {
        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập số tiền USD: ");
        usd = sc.nextDouble();
        double convert = usd * vnd;
        System.out.println("Giá trị VND:" +convert);
    }
}
