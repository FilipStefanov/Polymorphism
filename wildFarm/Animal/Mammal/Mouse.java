package wildFarm.Animal.Mammal;


import wildFarm.Food.Food;

import java.text.DecimalFormat;

public class Mouse extends Mammal {

    public Mouse(String animalType, String animalName, Double animalWeight, String livingRegion) {
        super(animalType, animalName, animalWeight, livingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println("SQUEEEAAAK!");
    }



    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equalsIgnoreCase("vegetable")) {
            super.eat(food);
            super.setFoodEaten(food.getQuantity());
          
        } else {
            System.out.println(
                    "Mice are not eating that type of food!"

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
