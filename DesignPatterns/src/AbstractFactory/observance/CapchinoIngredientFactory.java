package AbstractFactory.observance;

public class CapchinoIngredientFactory implements IngredientFactory{
    @Override
    public Beans getBeans() {
        return new AmericanoBeans();
    }

    @Override
    public Milk getMilk() {
        return new CowMilk();
    }

    @Override
    public Sugar getSugar() {
        return new BrownSugar();
    }
}
