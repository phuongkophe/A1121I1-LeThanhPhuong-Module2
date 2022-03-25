package FuramaResort.src.models;

public class Room extends Facility {
    private String freeServices;

    public Room() {
    }

    public Room(String freeServices) {
        this.freeServices = freeServices;
    }

    public Room(String serviceName, float usableArea, int rentalCosts, int maximumPeople, String rentalType, String freeServices) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.freeServices = freeServices;
    }

    public String getFreeServices() {
        return freeServices;
    }

    public void setFreeServices(String freeServices) {
        this.freeServices = freeServices;
    }

    @Override
    public String toString() {
        return "Room{" +
                "freeServices='" + freeServices + '\'' +
                '}' +super.toString();
    }
}
