public class EmailObserver implements Observer<String>{
    public void update(Notification<String> notification){
        System.out.println("EmailObserver: Received notification: " + notification.getContent());
    }
}
