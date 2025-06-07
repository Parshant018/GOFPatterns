package creational.abstractfactory;

import creational.abstractfactory.interfaces.Button;
import creational.abstractfactory.interfaces.Scrollbar;
import creational.abstractfactory.interfaces.UIFactory;
import creational.abstractfactory.windows.WindowsFactory;

//suppose this is my application using theme
public class RunAbstractFactory {

    private Button button;

    private Scrollbar scrollbar;

    public RunAbstractFactory(UIFactory uiFactory) {
        this.button = uiFactory.getButton();
        this.scrollbar = uiFactory.getScrollBar();
    }

    public static void run() {
        UIFactory factory = new WindowsFactory();
        RunAbstractFactory application = new RunAbstractFactory(factory);
        application.button.render();
        application.scrollbar.render();
    }
}
