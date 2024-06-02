public class Main {
    public static void main(String[] args) {
        VehicleFactory nissanFactory = new NissanFactory();
        Car nissanCar = nissanFactory.createCar();
        Truck nissanTruck = nissanFactory.createTruck();
        nissanCar.drive();
        nissanTruck.haul();

        VehicleFactory volkswagenFactory = new VolkswagenFactory();
        Car volkswagenCar = volkswagenFactory.createCar();
        Truck volkswagenTruck = volkswagenFactory.createTruck();
        volkswagenCar.drive();
        volkswagenTruck.haul();
    }
}