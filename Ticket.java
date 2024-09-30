import java.util.UUID;

public class Ticket {
  private String id;
  private Vehicle vehicle;
  private ParkingSpot parkingSpot;
  private long issuedAt;

  public Ticket(Vehicle vehicle, ParkingSpot parkingSpot) {
    this.id = UUID.randomUUID().toString();
    this.vehicle = vehicle;
    this.parkingSpot = parkingSpot;
    this.issuedAt = System.currentTimeMillis();
  }

  public String getId() {
    return id;
  }

  public ParkingSpot getParkingSpot() {
    return parkingSpot;
  }

}
