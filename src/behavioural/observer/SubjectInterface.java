package behavioural.observer;

public interface SubjectInterface {
    void attach(ObserverInterface obs);
    void detach(ObserverInterface obs);
    void notifyObs();
}
