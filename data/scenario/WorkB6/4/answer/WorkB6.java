import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        // Adding some employees to the list
        employees.add(new Employee("John Doe", 30, "Engineering"));
        employees.add(new Employee("Jane Smith", 45, "Marketing"));
        employees.add(new Employee("Emily Johnson", 22, "Sales"));
        employees.add(new Employee("Michael Brown", 28, "HR"));
        employees.add(new Employee("Sarah Davis", 37, "Finance"));
        
        // Asking user for age range
        System.out.println("Enter the minimum age: ");
        int minAge = scanner.nextInt();
        System.out.println("Enter the maximum age: ");
        int maxAge = scanner.nextInt();
        scanner.nextLine();  // Consume newline left-over
        
        displayEmployeesInAgeRange(employees, minAge, maxAge);
        
        scanner.close();
    }
    
    public static void displayEmployeesInAgeRange(ArrayList<Employee> employees, int minAge, int maxAge) {
        System.out.println("Employees between ages " + minAge + " and " + maxAge + ":");
        for (int i = 0; i < employees.size(); i++) {
            Employee emp = employees.get(i);
            if (emp.getAge() >= minAge && emp.getAge() <= maxAge) {
                System.out.println(emp);
            }
        }
    }
}