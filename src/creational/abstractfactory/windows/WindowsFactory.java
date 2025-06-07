package creational.abstractfactory.windows;

import creational.abstractfactory.interfaces.Button;
import creational.abstractfactory.interfaces.Scrollbar;
import creational.abstractfactory.interfaces.UIFactory;

public class WindowsFactory implements UIFactory {

    @Override
    public Scrollbar getScrollBar() {
        return new WindowsScrollBar();
    }

    @Override
    public Button getButton() {
        return new WindowsButton();
    }
}
