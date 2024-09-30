public class CarSpot extends ParkingSpot{

  public CarSpot(int number) {
    super(number);
  }


  @Override
  public boolean canFitVehicle(Vehicle vehicle) {
    return vehicle instanceof Car;
  }
}
