package ss12_java_collection_framework.exercise.product_management;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductManager {

    private static List<Product> productList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public void display(){
        for (Product product: productList ){
            System.out.println(product.toString());
        }
    }

    public void addNew(){
        System.out.println("Enter product ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter product Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter product price: ");
        int price = Integer.parseInt(scanner.nextLine());
    }

//    public void search(){
//        System.out.println("Enter product ID:");
//
//    }
}
