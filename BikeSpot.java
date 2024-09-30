public class BikeSpot extends ParkingSpot{
  public BikeSpot(int number) {
    super(number);
  }

  @Override
  public boolean canFitVehicle(Vehicle vehicle) {
    return vehicle instanceof Bike;
  }


}
