import java.util.*;

public class Student {

    int rollNo;

    String name;

    float marks;

    public Student accept() {

        Student s = new Student();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter roll number");

        rollNo = scanner.nextInt();

        System.out.println("Enter the name");

        name = scanner.next();

        System.out.println("Enter marks");

        marks = scanner.nextFloat();

        return s;

    }

    public Student display() {

        Student s = new Student();

        System.out.println("Roll number=" + rollNo);

        System.out.println("Name=");

        System.out.println(name);

        System.out.println("marks=" + marks);

        return s;

    }
}
