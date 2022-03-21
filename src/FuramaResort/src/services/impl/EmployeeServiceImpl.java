package services.impl;

import models.Employee;
import services.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {

    private static List<Employee> employeeList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {
        for (Employee employee: employeeList){
            System.out.println(employee.toString());
        }

    }

    @Override
    public void addNew() {
        System.out.println("Enter employee ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter employee Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter employee Address: ");
        String address = scanner.nextLine();
        System.out.println("Enter employee age: ");
        int age =  Integer.parseInt(scanner.nextLine());
        System.out.println("Enter employee Sex: ");
        String sex = scanner.nextLine();
        System.out.println("Enter employee Email: ");
        String email = scanner.nextLine();
        System.out.println("Enter employee ID Card: ");
        String idCard = scanner.nextLine();
        System.out.println("Enter employee phone number: ");
        int phoneNumber =  Integer.parseInt(scanner.nextLine());
        System.out.println("Enter employee level: ");
        String employeeLevel = scanner.nextLine();
        System.out.println("Enter employee position: ");
        String position = scanner.nextLine();
        System.out.println("Enter employee salary: ");
        int salary =  Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, address, age, sex, email, idCard, phoneNumber, employeeLevel, position, salary );
        employeeList.add(employee);

    }

    @Override
    public void edit() {
        System.out.println("Enter employee Id");
        List<Employee> employee = new ArrayList<>();
        int id = scanner.nextInt();

        
    }

    @Override
    public void delete() {

    }
}
