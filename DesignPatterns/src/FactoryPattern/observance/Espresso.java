package FactoryPattern.observance;


public class Espresso implements Coffee {
    private final String type;

    public Espresso(String type) {
        this.type = type;
    }

    @Override
    public void makeCoffee() {
        System.out.println("");
    }
}
