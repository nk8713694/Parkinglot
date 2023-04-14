package org.example;

public class MainClient {


    public static void main(String[] args) {


        ParkingLot mypp = new ParkingLot(2,2,2);


        Vehicle v = new Vehicle(VechileType.TRUCK);

        mypp.parkVehicle(v);
        Vehicle v1= new Vehicle(VechileType.TRUCK);

        Vehicle v2 = new Vehicle(VechileType.TRUCK);

        mypp.parkVehicle(v2);
        mypp.parkVehicle(v1);

    }


}
