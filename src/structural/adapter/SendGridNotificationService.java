package structural.adapter;

public class SendGridNotificationService {

    public void send(String to, String subject, String body) {
        System.out.println("sendgrid sending email to : "+ to);
        System.out.println("subject : "+subject);
        System.out.println("body : "+body);
    }
}
