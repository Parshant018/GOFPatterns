package structural.decorator;

public class CheezeDecorator extends PizzaDecorator {

    public CheezeDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizzaDecorator.getDescription() + " + cheeze";
    }

    @Override
    public double getCost() {
        return pizzaDecorator.getCost() + 1.0;
    }
}
