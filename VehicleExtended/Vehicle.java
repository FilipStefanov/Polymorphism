package VehicleExtended;

import java.text.DecimalFormat;

public abstract class Vehicle {

    private double fuelQuantity;
    private double fuelConsumption;



    public Vehicle(double fuelQuantity, double fuelConsumption) {
        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
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
       if (liters > 0){
           this.fuelQuantity += liters;
       }
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f",
                getClass().getSimpleName(),
                this.fuelQuantity);
    }
}
