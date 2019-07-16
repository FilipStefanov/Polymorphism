package VehicleExtended;

public class Car extends Vehicle {
    private  static  final double SUMMER_CONSUMPTION = 0.9;

    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption+SUMMER_CONSUMPTION);
    }
}
