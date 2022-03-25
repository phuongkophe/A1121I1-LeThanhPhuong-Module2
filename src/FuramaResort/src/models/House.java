package FuramaResort.src.models;

public class House extends Facility {
    private String houseStandard;
    private int numberOfFloors;

    public House() {
    }

    public House(String houseStandard, int numberOfFloors) {
        this.houseStandard = houseStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public House(String serviceName, float usableArea, int rentalCosts, int maximumPeople, String rentalType, String houseStandard, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.houseStandard = houseStandard;
        this.numberOfFloors = numberOfFloors;
    }

    public String getHouseStandard() {
        return houseStandard;
    }

    public void setHouseStandard(String houseStandard) {
        this.houseStandard = houseStandard;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseStandard='" + houseStandard + '\'' +
                ", numberOfFloors=" + numberOfFloors +
                '}' +super.toString();
    }
}
