package creational.singleton;

public class RunSingleton {
    public void run() {
        AppSettings instanceA = AppSettings.getInstance();
        AppSettings instanceB = AppSettings.getInstance();
        System.out.println(instanceA.getDatabaseUrl() + " | " + instanceB.getDatabaseUrl());
    }
}
