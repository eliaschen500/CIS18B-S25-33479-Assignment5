// A concrete implementation of Notification for emails
public class EmailNotification extends Notification<String> {
    public EmailNotification(String content) {
        super(content);
    }
}
