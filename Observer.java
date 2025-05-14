// Defines the Observer interface for receiving notifications
public interface Observer <T>{
    void update(Notification<T> notification);
}
