package FuramaResort.src.services.impl;

import FuramaResort.src.models.Customer;
import FuramaResort.src.services.CustomerService;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {

    private static List<Customer> customerList = new LinkedList<>();
    private static Scanner input = new Scanner(System.in);

    public Customer createCustomer(){
        System.out.println("Enter customer ID: ");
        String id = input.nextLine();

        System.out.println("Enter customer Name: ");
        String name = input.nextLine();

        System.out.println("Enter customer Address: ");
        String address = input.nextLine();

        System.out.println("Enter customer birthday: ");
        String birthday = input.nextLine();

        System.out.println("Enter customer Gender: ");
        String gender = input.nextLine();

        System.out.println("Enter employee Email: ");
        String email = input.nextLine();

        System.out.println("Enter customer ID Card: ");
        int idCard = Integer.parseInt(input.nextLine());

        System.out.println("Enter customer phone number: ");
        int phoneNumber = Integer.parseInt(input.nextLine());

        System.out.println("Enter customer type: ");
        String customerType = input.nextLine();

        return new Customer(id, name, address, birthday, gender, email, idCard, phoneNumber, customerType);
    }

    @Override
    public void display() {
        for (Customer customer : customerList) {
            System.out.println(customer.toString());
        }
    }

    @Override
    public void addNew() {
        customerList.add(createCustomer());
        System.out.println("\nAdded successfully");
    }

    @Override
    public void edit() {
        System.out.println("Enter customer Id you want to edit: ");
        String id = input.nextLine();
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId().contains(id) ) {
                System.out.println("Input information you want to edit");
                System.out.println(customerList.get(i));
                customerList.set(i, createCustomer());
                System.out.println("\nEdited successfully");
            } else {
                System.out.println("\nID not found");
            }
        }
    }

}
