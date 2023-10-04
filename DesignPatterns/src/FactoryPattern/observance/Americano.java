package FactoryPattern.observance;


public class Americano implements Coffee {
    private final String type;

    public Americano(String type) {
        this.type = type;
    }

    @Override
    public void makeCoffee() {
        System.out.println("");
    }
}
