package FuramaResort.src.services.impl;

import FuramaResort.src.models.Employee;
import FuramaResort.src.services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner input = new Scanner(System.in);

    public Employee createEmployee() {
        System.out.println("Enter employee ID: ");
        String id = input.nextLine();

        System.out.println("Enter employee Name: ");
        String name = input.nextLine();

        System.out.println("Enter employee Address: ");
        String address = input.nextLine();

        System.out.println("Enter employee birthday: ");
        String birthday = input.nextLine();

        System.out.println("Enter employee gender: ");
        String gender = input.nextLine();

        System.out.println("Enter employee Email: ");
        String email = input.nextLine();

        System.out.println("Enter employee ID Card: ");
        int idCard = Integer.parseInt(input.nextLine());

        System.out.println("Enter employee phone number: ");
        int phoneNumber = Integer.parseInt(input.nextLine());

        System.out.println("Enter employee level: ");
        String employeeLevel = input.nextLine();

        System.out.println("Enter employee position: ");
        String position = input.nextLine();

        System.out.println("Enter employee salary: ");
        int salary = Integer.parseInt(input.nextLine());

        return new Employee(id, name, address, birthday, gender, email, idCard, phoneNumber, employeeLevel, position, salary);

    }

    @Override
    public void display() {
        for (Employee employee : employeeList) {
            System.out.println(employee.toString());
        }

    }

    @Override
    public void addNew() {
        employeeList.add(createEmployee());
        System.out.println("\nAdded successfully");
    }

    @Override
    public void edit() {
        System.out.println("Enter employee Id you want to edit: ");
        String id = input.nextLine();
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId().contains(id) ) {
                System.out.println("Input information you want to edit");
                System.out.println(employeeList.get(i));
                employeeList.set(i, createEmployee());
                System.out.println("\nEdited successfully");
            } else {
                System.out.println("\nID not found");
            }
        }
    }

}
