package behavioural.state;

public class DirectionService {

    private TransportationMode transportationMode;

    public DirectionService(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public void setTransportationMode(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public int getETA() {
        return transportationMode.calcETA();
    }

    public String getDirections() {
        return transportationMode.getDirection();
    }
}
