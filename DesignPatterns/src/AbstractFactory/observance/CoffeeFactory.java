package AbstractFactory.observance;

public class CoffeeFactory {
    public Coffee makeCoffee(String type){
        Coffee coffee;
        switch (type) {
            case "Cappuccino":
                coffee = new Cappuccino(new CapchinoIngredientFactory());
                break;
            default:
                coffee = null;
        }
        return coffee;

    }
}
