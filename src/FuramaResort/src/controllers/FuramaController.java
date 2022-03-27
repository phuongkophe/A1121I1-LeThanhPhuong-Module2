package FuramaResort.src.controllers;

import FuramaResort.src.services.CustomerService;
import FuramaResort.src.services.EmployeeService;
import FuramaResort.src.services.impl.CustomerServiceImpl;
import FuramaResort.src.services.impl.EmployeeServiceImpl;

import java.util.Scanner;

public class FuramaController {
   static boolean check = true;

    public static void main(String[] args) {
        displayMainMenu();
    }

    public static void displayMainMenu() {
        while (check) {
            System.out.println("1. Employee Management");
            System.out.println("2. Customer Management");
            System.out.println("3. Facility Management");
            System.out.println("4. Booking  Management");
            System.out.println("5. Promotion  Management");
            System.out.println("6. Exit");
            Scanner scanner = new Scanner(System.in);

            switch (scanner.nextInt()) {
                case 1: {
                    displayEmployeeMenu();
                    break;
                }
                case 2: {
                    displayCustomerMenu();
                    break;
                }
                case 3: {
                    displayFacilityMenu();
                    break;
                }
                case 4: {
                    displayBookingMenu();
                    break;
                }
                case 5: {
                    displayPromotionMenu();
                    break;
                }
                case 6: System.exit(-1);
            }
        }
    }

    public static void displayEmployeeMenu() {
        EmployeeService employeeService = new EmployeeServiceImpl();
        while (check) {
            System.out.println("1. Display list employees");
            System.out.println("2. Add new employee");
            System.out.println("3. Edit employee");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    employeeService.display();
                    break;
                }
                case 2: {
                    employeeService.addNew();
                    break;
                }
                case 3: {
                    employeeService.edit();
                    break;
                }
                case 4: {
                    displayMainMenu();
                    break;
                }
            }
        }
    }

    public static void displayCustomerMenu() {
        CustomerService customerService = new CustomerServiceImpl();
        while (check) {
            System.out.println("1. Display list customers");
            System.out.println("2. Add new customers");
            System.out.println("3. Edit customers");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {
                    customerService.display();
                    break;
                }
                case 2: {
                    customerService.addNew();
                    break;
                }
                case 3: {
                    customerService.edit(););
                    break;
                }
                case 4: {
                    displayMainMenu();
                    break;
                }
            }
        }
    }
    public static void displayFacilityMenu() {
        while (check) {
            System.out.println("1. Display list facility");
            System.out.println("2. Add new facility");
            System.out.println("3. Display list facility maintenance");
            System.out.println("4. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {

                }
            }
        }
    }

    public static void displayBookingMenu() {
        while (check) {
            System.out.println("1. Add new booking");
            System.out.println("2. Display list booking");
            System.out.println("3. Create new constracts");
            System.out.println("4. Display list contracts");
            System.out.println("5. Edit contracts");
            System.out.println("6. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {

                }
            }
        }
    }
    public static void displayPromotionMenu() {
        while (check) {
            System.out.println("1. Display list customer use service");
            System.out.println("2. Display list customer get voucher");
            System.out.println("3. Return main menu");
            Scanner scanner = new Scanner(System.in);
            switch (scanner.nextInt()) {
                case 1: {

                }
            }
        }
    }
}
