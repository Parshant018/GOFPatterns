package behavioural.state;

public class Car implements TransportationMode{
    @Override
    public int calcETA() {
        return 4;
    }

    @Override
    public String getDirection() {
        return "Direction for car";
    }
}
