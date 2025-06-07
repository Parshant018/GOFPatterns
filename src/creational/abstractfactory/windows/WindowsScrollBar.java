package creational.abstractfactory.windows;

import creational.abstractfactory.interfaces.Scrollbar;

public class WindowsScrollBar implements Scrollbar {
    @Override
    public void render() {
        System.out.println("windows scroll bar");
    }
}
