public class OverloadingExample {
    // Overloaded method for adding two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method for adding two doubles
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method for adding three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        OverloadingExample obj = new OverloadingExample();

        System.out.println("Sum of two integers: " + obj.add(10, 20));
        System.out.println("Sum of two doubles: " + obj.add(10.5, 20.5));
        System.out.println("Sum of three integers: " + obj.add(10, 20, 30));
    }
}