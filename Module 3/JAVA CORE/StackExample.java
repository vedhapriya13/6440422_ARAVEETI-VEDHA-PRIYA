import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        // Pushing elements onto the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);

        // Popping an element
        System.out.println("Popped element: " + stack.pop());

        // Displaying elements
        System.out.println("Stack contents: " + stack);
    }
}