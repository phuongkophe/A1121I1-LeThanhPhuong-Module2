package FuramaResort.src.models;

import java.util.Date;

public class Booking {
    private String bookingId;
    private String startDay;
    private String endDate;
    private Customer customer;
    private Facility facility;

    public Booking() {
    }

    public Booking(String bookingId, String startDay, String endDate, Customer customer, Facility facility) {
        this.bookingId = bookingId;
        this.startDay = startDay;
        this.endDate = endDate;
        this.customer = customer;
        this.facility = facility;
    }

    public String getBookingId() {
        return bookingId;
    }

    public void setBookingId(String bookingId) {
        this.bookingId = bookingId;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Facility getFacility() {
        return facility;
    }

    public void setFacility(Facility facility) {
        this.facility = facility;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId='" + bookingId + '\'' +
                ", startDay=" + startDay +
                ", endDate=" + endDate +
                ", customer=" + customer +
                ", facility=" + facility +
                '}';
    }
}
