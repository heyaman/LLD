package FactoryPattern.observance;

public class CoffeeFactory {
    public Coffee makeCoffee(String type) {
        Coffee coffee;
        switch (type) {
            case "Americano":
                coffee = new Americano(type);
                break;
            case "Cappuccino":
                coffee = new Cappuccino(type);
                break;
            case "Espresso":
                coffee = new Espresso(type);
                break;
            default:
                coffee = null;
        }
        return coffee;
    }
}
