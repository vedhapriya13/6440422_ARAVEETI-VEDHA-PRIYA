public class OperatorPrecedence {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2; // Multiplication happens first
        int result2 = (10 + 5) * 2; // Parentheses change the order
        double result3 = 10.0 / 2 + 3 * 4; // Division happens first, then multiplication, then addition

        System.out.println("Result without parentheses: " + result1);
        System.out.println("Result with parentheses: " + result2);
        System.out.println("Complex expression result: " + result3);
    }
}