package org.example;

import java.util.ArrayList;
import java.util.List;

public class ParkingLot {

    private List<CompactSpot> compactSpots = new ArrayList<>();
    private List<BikeSpot> bikeSpots = new ArrayList<>();
    private List<LargeSpot> largeSpots = new ArrayList<>();



    int freecompactspots;
    int freebikespots;
    int freelargespots;


    public ParkingLot(int freecompactspots, int freebikespots, int freelargespots) {
        this.freecompactspots = freecompactspots;
        this.freebikespots = freebikespots;
        this.freelargespots = freelargespots;
    }


    // park a vehicle

  public void parkVehicle(Vehicle vehicle){

      System.out.println(" we are about to park your vehicle ");
         if(vehicle.getVechileType().equals(VechileType.TRUCK)){

             if(freelargespots > 0){

                 System.out.println(" free large spots "+freelargespots);
                  parkYourLargeVehicle(vehicle);
             }
             else {

                 System.out.println("sorry bro no large spots are available , please park in hell");
             }

         }
         else if(vehicle.getVechileType().equals(VechileType.CAR))
         {
             if(freecompactspots > 0){

                 parkYourCompactVehicle(vehicle);
             }
             else if(freelargespots > 0 ){
                 parkYourLargeVehicle(vehicle);
             }
             else {

                 System.out.println("sorry bro neither large or compact  spots are available , please park in hell");
             }
         }
         else {

             if(freebikespots > 0){

                 parkYourBikeVehicle(vehicle);
             }
             else if(freecompactspots > 0){

                 parkYourCompactVehicle(vehicle);
             }
             else if(freelargespots > 0 ){
                 parkYourLargeVehicle(vehicle);
             }
             else {

                 System.out.println("sorry bro no spots are available , please park in hell");
             }

         }

  }

  public void parkYourLargeVehicle(Vehicle v){

        LargeSpot l = new LargeSpot(ParkingSpotType.LARGE);
        l.setVehicle(v);
        l.setFree(false);
        v.setParkingSpot(l);
        largeSpots.add(l);
       System.out.println(" we have successfully parked your vehicle "+ v.getVechileType() + " and no is "+ v.getVehicleNo());
         freelargespots--;
  }

    public void parkYourCompactVehicle(Vehicle v){

        CompactSpot  l = new CompactSpot(ParkingSpotType.COMPACT);
        l.setVehicle(v);
        l.setFree(false);
        v.setParkingSpot(l);
        compactSpots.add(l);
        System.out.println(" we have successfully parked your vehicle "+ v.getVechileType() + " and no is "+ v.getVehicleNo());
        freecompactspots--;
    }

    public void parkYourBikeVehicle(Vehicle v){

        BikeSpot l = new BikeSpot(ParkingSpotType.BIKE);
        l.setVehicle(v);
        l.setFree(false);
        v.setParkingSpot(l);
        bikeSpots.add(l);
        System.out.println(" we have successfully parked your vehicle "+ v.getVechileType() + " and no is "+ v.getVehicleNo());
        freebikespots--;
    }


    // unpark a vehicle

    public void unParkVehicle(Vehicle v){


        System.out.println(" we are about to unpark your vehicle ");

        ParkingSpot p = v.getParkingSpot();
       // p.setFree(true);

        if(v.getVechileType().equals("TRUCK"))
        {
            largeSpots.remove(p);
            freelargespots++;
        }
        else  if(v.getVechileType().equals("CAR"))
        {
            compactSpots.remove(p);
            freecompactspots++;
        }
        else {
            bikeSpots.remove(p);
            freebikespots++;
        }
    }


}
