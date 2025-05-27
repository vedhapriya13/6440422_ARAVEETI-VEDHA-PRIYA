// Compile this class first: javac Example.java
public class Example {
    public void greet() {
        System.out.println("Hello, Java Bytecode!");
    }

    public static void main(String[] args) {
        Example ex = new Example();
        ex.greet();
    }
}

// After compiling, inspect bytecode using:
// javap -c Example