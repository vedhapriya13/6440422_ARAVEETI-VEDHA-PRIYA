// Compile this class first: javac Sample.java
public class Sample {
    private int number = 42;

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Sample s = new Sample();
        System.out.println("Number: " + s.getNumber());
    }
}

// Use a decompiler like JD-GUI or CFR to view the decompiled source.