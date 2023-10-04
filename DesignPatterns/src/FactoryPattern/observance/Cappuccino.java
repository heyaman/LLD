package FactoryPattern.observance;


public class Cappuccino implements Coffee {
    private final String type;

    public Cappuccino(String type) {
        this.type = type;
    }

    @Override
    public void makeCoffee() {
        System.out.println("your Cappuccino is ready sir");
    }
}
