package VehicleExtended;

import java.text.DecimalFormat;

public class Bus extends Vehicle{
    private static final double SUMMER_CONSUMPTION = 1.4;


    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption+SUMMER_CONSUMPTION, tankCapacity);
    }

    @Override
    public String driveEmpty(double distance){
        String output = null;
        double fuelNeeded = distance * (super.fuelConsumption-SUMMER_CONSUMPTION);

        if (fuelNeeded <= super.fuelQuantity) {
            super.fuelQuantity -= fuelNeeded;
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
}
