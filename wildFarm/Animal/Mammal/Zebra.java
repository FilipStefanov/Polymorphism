package wildFarm.Animal.Mammal;

import wildFarm.Animal.AnimalFoodAndSound;
import wildFarm.Food.Food;

import java.text.DecimalFormat;

public class Zebra extends Mammal implements AnimalFoodAndSound {


    public Zebra(String animalName, String animalType, Double animalWeight, String livingRegion) {
        super(animalName, animalType, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("Zs");
    }




    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equalsIgnoreCase("vegetable")) {
            super.eat(food);
            super.setFoodEaten(food.getQuantity());

        } else {
            System.out.println(
                    "Zebras are not eating that type of food!"

            );
            super.setFoodEaten(0);
        }
    }

    @Override
    public String toString() {

        DecimalFormat decimalFormat = new DecimalFormat("0.##");

        String string = "%s[%s, %s, %s, %d]";
        String weight = decimalFormat.format(super.getAnimalWeight());
        return String.format(string,
                getClass().getSimpleName(),
                super.getAnimalName(),

                weight,
                super.getLivingRegion(),
                super.getFoodEaten()

        );
    }

}
