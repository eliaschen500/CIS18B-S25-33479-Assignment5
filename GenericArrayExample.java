// Demonstrates a restriction in Java: cannot create generic arrays
public class GenericArrayExample<T> {
    public void showProblem() {
        // T[] arr = new T[10]; // Not allowed to create generic arrays in Java
        System.out.println("Java does not allow creating generic arrays due to type erasure limitation.");
    }
}
