package wildFarm.Animal.Mammal.Felime;


import wildFarm.Food.Food;

import java.text.DecimalFormat;

public class Cat extends Felime {
    private String breed;


    public Cat(String animalType, String animalName, Double animalWeight, String livingRegion, String breed) {
        super(animalType, animalName, animalWeight, livingRegion);
        this.breed = breed;
    }

    public String getBreed() {
        return this.breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    @Override
    public void makeSound() {
        System.out.println("Meowwww");
    }

    @Override
    public void eat(Food food){
        super.eat(food);
        super.setFoodEaten(food.getQuantity());
    }



    @Override
    public String toString() {

        DecimalFormat decimalFormat = new DecimalFormat("0.##");

        String string = "%s[%s, %s, %s, %s, %d]";
        String weight = decimalFormat.format(super.getAnimalWeight());
        return String.format(string,
                getClass().getSimpleName(),
                super.getAnimalName(),
                this.breed,
                weight,
                super.getLivingRegion(),
                super.getFoodEaten()

        );
    }



}
