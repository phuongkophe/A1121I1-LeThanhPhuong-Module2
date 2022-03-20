package models;

public class Customer extends Person{
    private String customerType;

    public Customer() {
    }

    public Customer(String customerType) {
        this.customerType = customerType;
    }

    public Customer(int id, String name, String address, int age, String sex, String email, String idCard, int phoneNumber, String customerType) {
        super(id, name, address, age, sex, email, idCard, phoneNumber);
        this.customerType = customerType;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerType='" + customerType + '\'' +
                '}' +super.toString();
    }
}
