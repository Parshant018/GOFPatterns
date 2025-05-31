package behavioural.state;
// In state pattern we internally decide IMPL to be used whereas in strategy we take input from user.
public class RunState {
    public void run() {
        DirectionService directionService = new DirectionService(new Cycle());
        directionService.setTransportationMode(new Car());
        System.out.println(directionService.getDirections());
    }
}
