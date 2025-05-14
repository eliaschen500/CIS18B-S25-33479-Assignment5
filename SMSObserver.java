public class SMSObserver implements Observer<String>{
    public void update(Notification<String> notification){
        System.out.println("SMSObserver: Received notification: " + notification.getContent());
    }
}
