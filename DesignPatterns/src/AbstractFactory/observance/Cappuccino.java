package AbstractFactory.observance;

public class Cappuccino extends Coffee {
    public Cappuccino(IngredientFactory ingredientFactory) {
        super(ingredientFactory);
    }

    public Cappuccino(CapchinoIngredientFactory capchinoIngredientFactory) {
        super(capchinoIngredientFactory);
    }

    @Override
    void boil() {

    }

    @Override
    void brew() {

    }
}
