package VehicleExtended;

import java.text.DecimalFormat;

public abstract class Vehicle {

    protected double fuelQuantity;
    protected double fuelConsumption;
    protected double tankCapacity;



    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
        this.tankCapacity = tankCapacity;
    }

    public String drive(double distance) {
        String output = null;
        double fuelNeeded = distance * this.fuelConsumption;

        if (fuelNeeded <= this.fuelQuantity) {
            this.fuelQuantity -= fuelNeeded;
            DecimalFormat format = new DecimalFormat("#.##");

            output = String.format("%s travelled %s km",
                    this.getClass().getSimpleName(),
                    format.format(distance)
            );
        } else {
            output = String.format("%s needs refueling",
                    this.getClass().getSimpleName()
            );
        }
        return output;
    }

    public void refuel(double liters) {
        if (liters <= 0){
            System.out.println("Fuel must be a positive number");
            return;
        }

        double refueledTank = fuelQuantity + liters;
        if  (refueledTank <= this.tankCapacity){
            this.fuelQuantity = refueledTank;
        }else{
            System.out.println("Cannot fit fuel in tank");
        }

    }
    public abstract String driveEmpty(double distance);

    @Override
    public String toString() {
        return String.format("%s: %.2f",
                getClass().getSimpleName(),
                this.fuelQuantity);
    }
}
