package wildFarm.Animal.Mammal.Felime;

import wildFarm.Food.Food;

import java.text.DecimalFormat;

public class Tiger extends Felime {
    private String livingRegion;


    public Tiger(String animalType, String animalName, Double animalWeight, String livingRegion ) {
        super(animalType, animalName, animalWeight, livingRegion);
       this.livingRegion = livingRegion;
    }

    @Override
    public void makeSound() {
        System.out.println("ROAAR!!!");
    }

    @Override
    public String getLivingRegion() {
        return this.livingRegion;
    }

    @Override
    public void setLivingRegion(String livingRegion) {
        this.livingRegion = livingRegion;
    }

    @Override
    public void eat(Food food) {
        if (food.getClass().getSimpleName().equalsIgnoreCase("meat")) {
            super.eat(food);
            super.setFoodEaten(food.getQuantity());

        } else {
            System.out.println(
                    "Tigers are not eating that type of food!"
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
