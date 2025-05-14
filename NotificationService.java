// NotificationService.java
import java.util.*;

public class NotificationService<T> {
    private List<Observer<? super T>> observers = new ArrayList<>();

    public void addObserver(Observer<? super T> observer) {
        observers.add(observer);
    }

    public void notifyAllObservers(Notification<T> notification) {
        for (Observer<? super T> observer : observers) {
            ((Observer<T>) observer).update(notification);
        }
    }
}