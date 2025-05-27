import java.util.*;

class Student {
    String name;
    int marks;

    public Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }

    public String toString() {
        return name + ": " + marks;
    }
}

class MarksComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return Integer.compare(s2.marks, s1.marks); // Sorting in descending order
    }
}

public class SortingExample {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 85));
        students.add(new Student("Bob", 78));
        students.add(new Student("Charlie", 92));

        // Sorting using Comparator
        Collections.sort(students, new MarksComparator());

        System.out.println("Sorted Student List:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}