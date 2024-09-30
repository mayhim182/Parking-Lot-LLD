import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ParkingLot {
  private String name;
  private List<ParkingFloor> floors;
  private Map<String, Ticket> activeTickets;


  public ParkingLot(String name, int numFloors, int spotsPerFloor) {
    this.name = name;
    this.floors = new ArrayList<>();
    this.activeTickets = new HashMap<>();
    for(int i = 0; i<numFloors; i++) {
      floors.add(new ParkingFloor(i+1, spotsPerFloor));
    }
  }

  public Ticket parkVehicle(Vehicle vehicle) {
    for(ParkingFloor parkingFloor:floors) {
      ParkingSpot parkingSpot = parkingFloor.getAvailableSpot(vehicle);
      if(parkingSpot!=null) {
        parkingSpot.assignVehicle(vehicle);
        Ticket ticket = new Ticket(vehicle, parkingSpot);
        activeTickets.put(ticket.getId(), ticket);
        return ticket;
      }
    }
    throw new RuntimeException("No available spots for the vehicle");
  }

  public void unparkVehicle(String ticketId) {
    Ticket ticket = activeTickets.remove(ticketId);
    if (ticket != null) {
      ticket.getParkingSpot().removeVehicle();
    } else {
      throw new RuntimeException("Invalid ticket ID");
    }
  }

  public void displayAvailableSpots() {
    for(ParkingFloor parkingFloor: floors) {
      parkingFloor.displayAvailableSpots();
    }
  }



}
