import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        ArrayList<StudentB6> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1: Add student");
            System.out.println("2: Display students");
            System.out.println("3: Exit");
            System.out.print("Choose option (1-3): ");
            int option = sc.nextInt();
            sc.nextLine(); // consume the newline

            if (option == 1) {
                // Adding a new student
                System.out.print("Enter student name: ");
                String name = sc.nextLine();
                System.out.print("Enter student age: ");
                int age = sc.nextInt();
                sc.nextLine(); // consume the newline

                students.add(new StudentB6(name, age));
                System.out.println("Student added.");
            } else if (option == 2) {
                // Display all students
                System.out.println("Number of students: " + students.size());
                for (int i = 0; i < students.size(); i++) {
                    System.out.println((i + 1) + ": " + students.get(i).toString());
                }
            } else if (option == 3) {
                // Exit
                System.out.println("Exiting...");
                break;
            } else {
                System.out.println("Invalid option. Please choose 1, 2, or 3.");
            }
        }

        sc.close();
    }
}