package creational.singleton;

public class AppSettings {

    private static AppSettings instance;
    private String databaseUrl;
    private String apiKey;

    private AppSettings () {
        this.databaseUrl = "https://databaseurl.com";
        this.apiKey = "secretkey";
    }

    public static AppSettings getInstance() {
        if(instance == null) {
            instance = new AppSettings();
        }
        return instance;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getDatabaseUrl() {
        return this.databaseUrl;
    }
}
