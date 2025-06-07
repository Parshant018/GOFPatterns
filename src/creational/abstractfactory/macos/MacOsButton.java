package creational.abstractfactory.macos;

import creational.abstractfactory.interfaces.Button;

public class MacOsButton implements Button {
    @Override
    public void render() {
        System.out.println("mac os button");
    }
}
