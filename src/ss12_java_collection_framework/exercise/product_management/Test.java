package ss12_java_collection_framework.exercise.product_management;

import java.util.Scanner;

public class Test {
        public static void displayMainMenu(){
            boolean check = true;
            while (check) {
                System.out.println("1. Add new product");
                System.out.println("2. Edit product");
                System.out.println("3. Sort product by price");
                System.out.println("4. Sort product by name");
                System.out.println("5. Delete product");
                System.out.println("6. Exit");
                Scanner scanner = new Scanner(System.in);

                switch (scanner.nextInt()){
                    case 1:
                }

            }
        }
    }

    public static void main(String[] args) {

    }
