package structural.decorator;

public abstract class PizzaDecorator implements Pizza {
    protected Pizza pizzaDecorator;

    public PizzaDecorator(Pizza pizza) {
        this.pizzaDecorator = pizza;
    }

    @Override
    public String getDescription() {
        return pizzaDecorator.getDescription();
    }

    @Override
    public double getCost(){
        return pizzaDecorator.getCost();
    }
}
