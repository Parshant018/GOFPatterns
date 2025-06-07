package creational.abstractfactory.macos;

import creational.abstractfactory.interfaces.Scrollbar;

public class MacOsScrollBar implements Scrollbar {
    @Override
    public void render() {
        System.out.println("mac os scroll bar");
    }
}
