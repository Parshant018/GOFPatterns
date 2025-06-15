package structural.adapter;

public class SendGridAdapter implements NotificationService{

    private SendGridNotificationService sendGridNotificationService;

    public SendGridAdapter(SendGridNotificationService service) {
        this.sendGridNotificationService = service;
    }

    @Override
    public void send(String to, String subject, String body) {
        sendGridNotificationService.send(to,subject, body);
    }
}
