package VehicleExtended;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        Vehicle car = produceVehicle(scanner.nextLine().split("\\s+"));
        Vehicle truck = produceVehicle(scanner.nextLine().split("\\s+"));

        Map<String, Vehicle> vehicles = new HashMap<>();

        vehicles.put("Car", car);
        vehicles.put("Truck", truck);

        int n = Integer.parseInt(scanner.nextLine());

        while (n-- > 0){

            String[] data = scanner.nextLine().split("\\s+");
            String output = null;

            if (data[0].equals("Drive")){
                output = vehicles.get(data[1]).drive(Double.parseDouble(data[2]));
            }else{
               vehicles.get(data[1]).refuel(Double.parseDouble(data[2]));
            }
            if (output!= null){
                System.out.println(output);
            }
        }

        vehicles.forEach((key, value) -> System.out.println(value.toString()));


    }

    public static Vehicle produceVehicle  (String[] data){

        Vehicle vehicle = null;
        if (data[0].equals("Car")){
            vehicle =
                    new Car(
                            Double.parseDouble(data[1]),
                            Double.parseDouble(data[2])
                    );
        }else if(data[0].equals("Truck")) {
            vehicle =
                    new Truck(
                            Double.parseDouble(data[1]),
                            Double.parseDouble(data[2])
                    );
        }

        return  vehicle;
    }
}
