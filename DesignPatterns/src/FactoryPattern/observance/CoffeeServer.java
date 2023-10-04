package FactoryPattern.observance;

public class CoffeeServer {
    private final CoffeeFactory cofferFactory;

    public CoffeeServer() {
        this.cofferFactory = new CoffeeFactory();
    }

    public static void main(String[] args) {
        CoffeeServer coffeeServer=new CoffeeServer();
        Coffee cappuccino = coffeeServer.cofferFactory.makeCoffee("Cappuccino");
        cappuccino.makeCoffee();

    }
}
