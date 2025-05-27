interface MathOperation {
    int operation(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        // Using a lambda expression for addition
        MathOperation addition = (a, b) -> a + b;
        
        System.out.println("Sum: " + addition.operation(5, 3));
    }
}