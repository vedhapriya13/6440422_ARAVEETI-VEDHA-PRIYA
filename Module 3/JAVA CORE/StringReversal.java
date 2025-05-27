import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
        // Prompt the user for a string
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string using StringBuilder
        StringBuilder reversedString = new StringBuilder(input);
        reversedString.reverse();

        // Display the reversed string
        System.out.println("Reversed string: " + reversedString.toString());
    }
}