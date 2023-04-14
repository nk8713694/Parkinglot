package org.example;

public class Vehicle {


    private int vehicleNo;

    private VechileType vechileType;

    private ParkingSpot parkingSpot;

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public VechileType getVechileType() {
        return vechileType;
    }

    public Vehicle(VechileType vechileType) {
        this.vechileType = vechileType;
    }

    public void setVechileType(VechileType vechileType) {
        this.vechileType = vechileType;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
