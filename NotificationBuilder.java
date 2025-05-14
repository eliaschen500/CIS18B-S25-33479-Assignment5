public class NotificationBuilder<T> {
    private T content;

    public NotificationBuilder<T> setContent(T content){
        this.content = content;
        return this;
    }
    public Notification<T> build(){
        return new Notification<T>(content){};
    }
}
