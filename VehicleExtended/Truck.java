package VehicleExtended;

public class Truck extends Vehicle {
    private static final double SUMMER_CONSUMPTION = 1.6;

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption+SUMMER_CONSUMPTION, tankCapacity);
    }


    @Override
    public void refuel(double liters) {
        super.refuel(liters * 0.95);
    }

    @Override
    public String driveEmpty(double distance) {
        return null;
    }
}
