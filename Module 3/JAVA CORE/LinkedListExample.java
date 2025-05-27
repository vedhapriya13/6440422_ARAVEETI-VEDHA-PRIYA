import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> fruits = new LinkedList<>();

        // Adding elements
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        // Removing an element
        fruits.remove("Banana");

        // Displaying elements
        System.out.println("Linked List contents:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}