package wildFarm;

import wildFarm.Animal.Animal;
import wildFarm.Animal.Mammal.Felime.Cat;
import wildFarm.Animal.Mammal.Felime.Tiger;
import wildFarm.Animal.Mammal.Mouse;
import wildFarm.Animal.Mammal.Zebra;
import wildFarm.Food.Food;
import wildFarm.Food.Meat;
import wildFarm.Food.Vegetable;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = "";

        List<Animal> animals = new ArrayList<Animal>();


        while (!"End".equalsIgnoreCase(input = scanner.nextLine())) {

            String[] animalInformation = (input.split("\\s+"));
            Animal animal = animalType(animalInformation);

            String[] foodInformation = (scanner.nextLine().split("\\s+"));
            Food food = food(foodInformation);

            if (animal == null || food == null){
                continue;
            }
            animal.makeSound();
            animal.eat(food);
            animals.add(animal);
        }

       StringBuilder builder = new StringBuilder();
        for (Animal animal : animals) {
            builder.append(animal.toString())
                    .append(System.lineSeparator());
        }

        System.out.println(builder.toString().trim());
    }

    private static Food food(String [] foodInformation) {

        String foodType = foodInformation[0];
        Integer quantity = Integer.parseInt(foodInformation[1]);
        Food food = null;

        if (foodType.equalsIgnoreCase("Vegetable")) {
            food = new Vegetable(quantity);

        } else {
            food = new Meat(quantity);

        }
        return food;
    }

    private static Animal animalType(String[] animalInformation){

        String animalType = animalInformation[0];
        String name = animalInformation[1];
        Double weight = Double.parseDouble(animalInformation[2]);
        String livingRegion = animalInformation[3];

        Animal animal = null;

        switch (animalType) {
            case "Mouse":
                animal = new Mouse(animalType, name, weight, livingRegion);
                break;

            case "Zebra":
                animal = new Zebra(animalType, name, weight, livingRegion);
                break;

            case "Cat":
                animal = new Cat(animalType, name, weight, livingRegion, animalInformation[4]);
                break;

            case "Tiger":
                animal = new Tiger(animalType, name, weight, livingRegion);
                break;
        }
        return animal;
    }

}
