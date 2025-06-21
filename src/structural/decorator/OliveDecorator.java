package structural.decorator;

public class OliveDecorator extends PizzaDecorator {

    public OliveDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getDescription() {
        return pizzaDecorator.getDescription() + " + olive";
    }

    @Override
    public double getCost() {
        return pizzaDecorator.getCost() + 1.0;
    }

}
