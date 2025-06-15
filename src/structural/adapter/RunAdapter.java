package structural.adapter;

public class RunAdapter {

    public void run() {
        NotificationService service = new EmailNotificationService();
        service.send("abc", "old service", "old service body");

        NotificationService service1 = new SendGridAdapter(new SendGridNotificationService());
        service1.send("abc", "new service", "new service body");
    }
}
