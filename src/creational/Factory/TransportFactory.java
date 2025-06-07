package creational.Factory;

public class TransportFactory {

    public static Transport createTransport(String type) {
        switch(type.toLowerCase()) {
            case "bike":
                return new Bike();
            case "car" :
                return new Car();
            default:
                return new Bike();
        }
    }
}
