package structural.adapter;

public class EmailNotificationService implements NotificationService{
    @Override
    public void send(String to, String subject, String body) {
        System.out.println("sending old email to :" + to);
        System.out.println("subject :" + subject);
        System.out.println("body :" + body);
    }
}
