import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a string to write into a file: ");
        String data = sc.nextLine();
        
        try (FileWriter writer = new FileWriter("output.txt")) {
            writer.write(data);
            System.out.println("Data written successfully to output.txt.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}