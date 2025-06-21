package structural.decorator;

public class RunDecorator {

    public void run() {
        Pizza pizza = new BasicPizza();

        pizza = new CheezeDecorator(pizza);
        pizza = new MushroomDecorator(pizza);

        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }
}
