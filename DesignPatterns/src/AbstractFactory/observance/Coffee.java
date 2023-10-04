package AbstractFactory.observance;

public abstract class Coffee {
    private final Beans beans;
    private final Milk milk;
    private final Sugar sugar;

    public Coffee(IngredientFactory ingredientFactory) {
        this.beans =ingredientFactory.getBeans();
        this.milk = ingredientFactory.getMilk();
        this.sugar = ingredientFactory.getSugar();
    }

    abstract void boil();
    abstract void brew();
}
