package models;

import java.util.Date;

public class Booking {
    private String bookingId;
    private Date startDay;
    private Date endDate;
    private Customer customer;
    private Facility facility;

    public Booking() {
    }

    public Booking(String bookingId, Date startDay, Date endDate, Customer customer, Facility facility) {
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

    public Date getStartDay() {
        return startDay;
    }

    public void setStartDay(Date startDay) {
        this.startDay = startDay;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
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
