public class Main {
  public static void main(String[] args){
    ParkingLot parkingLot = new ParkingLot("City center parking", 2, 30);

    Vehicle car1 = new Car("ABC-123");
    Vehicle bike1 = new Bike("ABC223");
    Vehicle truck1 = new Truck("ABC224");


    Ticket ticket1 = parkingLot.parkVehicle(car1);
    Ticket ticket2 = parkingLot.parkVehicle(bike1);
    Ticket ticket3 = parkingLot.parkVehicle(truck1);

    parkingLot.displayAvailableSpots();

    parkingLot.unparkVehicle(ticket1.getId());

    parkingLot.displayAvailableSpots();
  }
}
