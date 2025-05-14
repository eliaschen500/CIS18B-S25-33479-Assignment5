
// Main class to demonstrate the notification system
public class Main {
    public static void main(String[] args) {
        // Create a service for String-based notifications
        NotificationService<String> service = new NotificationService<>();

        // Add observers
        service.addObserver(new EmailObserver());
        service.addObserver(new SMSObserver());

        // Use factories to create notifications
        EmailNotificationFactory emailFactory = new EmailNotificationFactory();
        SMSNotificationFactory smsFactory = new SMSNotificationFactory();

        Notification<String> email = emailFactory.createNotification("Welcome to MarketBridge!");
        Notification<String> sms = smsFactory.createNotification("Your order has shipped.");
        // Notify observers
        service.notifyAllObservers(email);
        service.notifyAllObservers(sms);

        // Build a custom notification
        Notification<String> custom = new NotificationBuilder<String>()
                .setContent("Built from builder")
                .build();
        service.notifyAllObservers(custom);
    }
}

