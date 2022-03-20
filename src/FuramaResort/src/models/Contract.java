package models;

public class Contract {
    private String contractId;
    private double payment;
    private double deposit;
    private Booking booking;
    private Customer customer;

    public Contract() {
    }

    public Contract(String contractId, double payment, double deposit, Booking booking, Customer customer) {
        this.contractId = contractId;
        this.payment = payment;
        this.deposit = deposit;
        this.booking = booking;
        this.customer = customer;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public double getPayment() {
        return payment;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Contract{" +
                "contractId='" + contractId + '\'' +
                ", payment=" + payment +
                ", deposit=" + deposit +
                ", booking=" + booking +
                ", customer=" + customer +
                '}';
    }
}
