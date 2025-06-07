package creational.abstractfactory.macos;

import creational.abstractfactory.interfaces.Button;
import creational.abstractfactory.interfaces.Scrollbar;
import creational.abstractfactory.interfaces.UIFactory;

public class MacOsFactory implements UIFactory {
    @Override
    public Scrollbar getScrollBar() {
        return new MacOsScrollBar();
    }

    @Override
    public Button getButton() {
        return new MacOsButton();
    }
}
