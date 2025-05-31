package behavioural.observer;

public class RunObserver {
    public void run() {
        WeatherStation weatherStation = new WeatherStation();
        weatherStation.setTemperatur(25f);
        Mobile mobile = new Mobile();
        SmartWatch watch = new SmartWatch();
        weatherStation.attach(mobile);
        weatherStation.attach(watch);
        weatherStation.notifyObs();
    }
}
