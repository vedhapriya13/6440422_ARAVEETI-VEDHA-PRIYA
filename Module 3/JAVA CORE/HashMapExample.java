import java.util.HashMap;
import java.util.Scanner;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> studentMap = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        
        // Adding entries
        studentMap.put(101, "Alice");
        studentMap.put(102, "Bob");
        studentMap.put(103, "Charlie");
        
        // User input to retrieve a name
        System.out.print("Enter student ID: ");
        int id = scanner.nextInt();
        
        // Displaying student name based on ID
        String name = studentMap.get(id);
        if (name != null) {
            System.out.println("Student Name: " + name);
        } else {
            System.out.println("Student ID not found.");
        }
        
        scanner.close();
    }
}