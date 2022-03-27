package FuramaResort.src.models;

public class Customer extends Person{
    private String customerType;

    public Customer() {
    }

    public Customer(String customerType) {
        this.customerType = customerType;
    }

    public Customer(String id, String name, String address, String birthday, String gender, String email, int idCard, int phoneNumber, String customerType) {
        super(id, name, address, birthday, gender, email, idCard, phoneNumber);
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
