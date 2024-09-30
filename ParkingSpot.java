public abstract class ParkingSpot {
    private int number;
    private boolean available;
    private Vehicle vehicle;

    public ParkingSpot(int number) {
      this.number = number;
      this.available = true;
    }

    public boolean isAvailable() {
      return available;
    }

    public void assignVehicle(Vehicle vehicle) {
      this.vehicle = vehicle;
      this.available = false;
    }

    public void removeVehicle() {
      this.vehicle = null;
      this.available = true;
    }

   public abstract boolean canFitVehicle(Vehicle vehicle);
}
