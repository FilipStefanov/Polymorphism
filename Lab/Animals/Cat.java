package Lab.Animals;

public class Cat extends Animal {


    public Cat(String name, String favouriteFood) {
        super(name, favouriteFood);
    }

    @Override
    public String explainSelf() {
        String format =  "%nMEEOW";
        return String.format("%s%s",
                super.explainSelf(),
                format
        );
    }
}
