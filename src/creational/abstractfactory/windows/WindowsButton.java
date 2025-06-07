package creational.abstractfactory.windows;

import creational.abstractfactory.interfaces.Button;

public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("windows button");
    }
}
