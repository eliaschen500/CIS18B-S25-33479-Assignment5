// Demonstrates Java's type erasure limitation
public class TypeErasureExample {
    public void explain() {
        // Cannot use instanceof with generic types
        System.out.println("Can't check instanceof Notification<String> due to type erasure.");
    }
}
