package behavioural.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements SubjectInterface{

    List<ObserverInterface> observerList;
    private float temperature;

    WeatherStation() {
        observerList = new ArrayList<>();
    }

    public void setTemperatur(float temperature) {
        this.temperature = temperature;
    }

    @Override
    public void attach(ObserverInterface obs) {
        observerList.add(obs);
    }

    @Override
    public void detach(ObserverInterface obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObs() {
        for(ObserverInterface observer : observerList) {
            observer.update(temperature);
        }
    }
}
