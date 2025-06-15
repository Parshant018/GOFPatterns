import behavioural.command.RunCommand;
import behavioural.iterator.RunIterator;
import behavioural.mediator.RunMediator;
import behavioural.memento.RunMemento;
import behavioural.observer.RunObserver;
import behavioural.state.RunState;
import behavioural.strategy.RunStartegy;
import behavioural.template.RunTemplate;
import creational.Factory.RunFactory;
import creational.abstractfactory.RunAbstractFactory;
import creational.builder.RunBuilder;
import creational.prototype.RunPrototype;
import creational.singleton.RunSingleton;

public class Main {
    public static void main(String[] args) {
        //Behavioural Patterns
        new RunMemento().run();
        new RunObserver().run();
        new RunStartegy().run();
        new RunCommand().run();
        new RunTemplate().run();
        new RunIterator().run();
        new RunState().run();
        new RunMediator().run();


        //Creational Patterns
        new RunSingleton().run();
        new RunBuilder().run();
        new RunFactory().run();
        RunAbstractFactory.run();
        new RunPrototype().run();
    }
}