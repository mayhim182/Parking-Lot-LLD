public class TruckSpot extends ParkingSpot{
  public TruckSpot(int number) {
    super(number);
  }

  @Override
  public boolean canFitVehicle(Vehicle vehicle) {
    return vehicle instanceof Truck;
  }


}
