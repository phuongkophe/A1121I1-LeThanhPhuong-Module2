package models;

public class Villa extends Facility {
    private String villaStandard;
    private double poolArea;
    private int numberOfFloors;

    public Villa() {
    }

    public Villa(String villaStandard, double poolArea, int numberOfFloors) {
        this.villaStandard = villaStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public Villa(String serviceName, float usableArea, int rentalCosts, int maximumPeople, String rentalType, String villaStandard, double poolArea, int numberOfFloors) {
        super(serviceName, usableArea, rentalCosts, maximumPeople, rentalType);
        this.villaStandard = villaStandard;
        this.poolArea = poolArea;
        this.numberOfFloors = numberOfFloors;
    }

    public String getVillaStandard() {
        return villaStandard;
    }

    public void setVillaStandard(String villaStandard) {
        this.villaStandard = villaStandard;
    }

    public double getPoolArea() {
        return poolArea;
    }

    public void setPoolArea(double poolArea) {
        this.poolArea = poolArea;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }

    @Override
    public String toString() {
        return "Villa{" +
                "villaStandard='" + villaStandard + '\'' +
                ", poolArea=" + poolArea +
                ", numberOfFloors=" + numberOfFloors +
                '}' +super.toString();
    }
}
