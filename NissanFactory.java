public class NissanFactory implements VehicleFactory {

    @Override
    public Car createCar() {
        return new NissanCar();
    }

    @Override
    public Truck createTruck() {
        return new NissanTruck();
    }
}
