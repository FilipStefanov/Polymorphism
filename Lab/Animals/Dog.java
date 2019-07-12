package Lab.Animals;

public class Dog extends Animal {


    public Dog(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        String format = "%nDJAAF";
        return String.format("%s%s",
                super.explainSelf(),
                format
        );
    }

}
