package behavioural.observer;

public class Mobile implements ObserverInterface{
    @Override
    public void update(float temperature) {
        System.out.println("Temperature received on mobile "+ temperature);
    }
}
