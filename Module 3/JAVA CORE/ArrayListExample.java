import java.util.ArrayList;

public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList<String> items = new ArrayList<>();
        
        // Adding elements
        items.add("Apple");
        items.add("Banana");
        items.add("Cherry");

        // Displaying elements
        System.out.println("ArrayList contents:");
        for (String item : items) {
            System.out.println(item);
        }
    }
}