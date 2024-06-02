public class VolkswagenFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new VolkswagenCar();
    }
    @Override
    public Truck createTruck() {
        return new VolkswagenTruck();
    }
}
