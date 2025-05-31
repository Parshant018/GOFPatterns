package behavioural.state;

public class Cycle implements TransportationMode{
    @Override
    public int calcETA() {
        return 10;
    }

    @Override
    public String getDirection() {
        return "Direction for cycle";
    }
}
