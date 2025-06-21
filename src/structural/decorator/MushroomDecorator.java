package structural.decorator;

public class MushroomDecorator extends PizzaDecorator {

    public MushroomDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizzaDecorator.getDescription() + " + mushroom";
    }

    @Override
    public double getCost() {
        return pizzaDecorator.getCost() + 2.0;
    }

}
