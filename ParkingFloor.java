import java.util.ArrayList;
import java.util.List;

public class ParkingFloor {
  private int floorNumber;
  private List<ParkingSpot> spots;

  public ParkingFloor(int floorNumber, int totalSpots) {
    this.floorNumber = floorNumber;
    this.spots = new ArrayList<>();
    for(int i = 0; i<totalSpots/3; i++) {
      //incremental ids simple technique but noice
      spots.add(new BikeSpot(i));
      spots.add(new CarSpot(i+1));
      spots.add(new TruckSpot(i+2));
    }
  }

  public ParkingSpot getAvailableSpot(Vehicle vehicle) {
    for(ParkingSpot parkingSpot:spots) {
      if(parkingSpot.isAvailable() && parkingSpot.canFitVehicle(vehicle)) {
        return parkingSpot;
      }
    }
    return null;
  }

  public void displayAvailableSpots() {
    int availableSpots = 0;
    for(ParkingSpot spot: spots) {
      if(spot.isAvailable()) {
        availableSpots++;
      }
    }
    System.out.println("Floor "+floorNumber+" has "+availableSpots+" available spots ");
  }
}
