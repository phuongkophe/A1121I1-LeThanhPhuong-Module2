package FuramaResort.src.models;

public class Employee extends Person {
    private String employeeLevel;
    private String position;
    private int salary;

    public Employee() {
    }

    public Employee(String employeeLevel, String position, int salary) {
        this.employeeLevel = employeeLevel;
        this.position = position;
        this.salary = salary;
    }

    public Employee(String id, String name, String birthday, String age, String gender, String email, int idCard, int phoneNumber, String employeeLevel, String position, int salary) {
        super(id, name, birthday, age, gender, email, idCard, phoneNumber);
        this.employeeLevel = employeeLevel;
        this.position = position;
        this.salary = salary;
    }

    public String getEmployeeLevel() {
        return employeeLevel;
    }

    public void setEmployeeLevel(String employeeLevel) {
        this.employeeLevel = employeeLevel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeLevel='" + employeeLevel + '\'' +
                ", position='" + position + '\'' +
                ", salary=" + salary +
                '}' + super.toString();
    }
}
