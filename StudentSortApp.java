import java.util.ArrayList;
import java.util.Scanner;

public class StudentSortApp {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(107, "Emily", "Pueblo"));
        students.add(new Student(103, "Carlos", "Denver"));
        students.add(new Student(110, "Zoe", "Colorado Springs"));
        students.add(new Student(101, "Aiden", "Pueblo West"));
        students.add(new Student(105, "Grace", "Canon City"));
        students.add(new Student(108, "Noah", "Aurora"));
        students.add(new Student(102, "Bella", "Pueblo"));
        students.add(new Student(109, "Sophia", "Trinidad"));
        students.add(new Student(104, "Daniel", "Fountain"));
        students.add(new Student(106, "Liam", "Denver"));

        Scanner input = new Scanner(System.in);
        System.out.println("Student Sorting Program");
        System.out.println("1. Sort by name");
        System.out.println("2. Sort by roll number");
        System.out.println("3. Show original list");
        System.out.print("Choose an option (1-3): ");

        if (!input.hasNextInt()) {
            System.out.println("Please enter a number from 1 to 3.");
            input.close();
            return;
        }

        int choice = input.nextInt();
        if (choice == 1) {
            SelectionSort.sort(students, new NameComparator());
            System.out.println("\nStudents sorted by name:");
        } else if (choice == 2) {
            SelectionSort.sort(students, new RollNumberComparator());
            System.out.println("\nStudents sorted by roll number:");
        } else if (choice == 3) {
            System.out.println("\nOriginal student list:");
        } else {
            System.out.println("Please enter a number from 1 to 3.");
            input.close();
            return;
        }

        System.out.println("Roll No | Name | Address");
        for (Student student : students) {
            System.out.println(student);
        }
        input.close();
    }
}
