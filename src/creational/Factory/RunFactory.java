package creational.Factory;

public class RunFactory {
    public void run() {
        Transport vehicle = TransportFactory.createTransport("car");
        System.out.println(vehicle.printTransport());
    }
}
