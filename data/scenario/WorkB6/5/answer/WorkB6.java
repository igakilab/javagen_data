import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        ArrayList<Project> projects = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Example project data input
        System.out.println("Enter the number of projects:");
        int projectCount = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < projectCount; i++) {
            System.out.println("Enter project name:");
            String name = scanner.nextLine();

            System.out.println("Enter project start date (yyyyMMdd):");
            String startDate = scanner.nextLine();

            System.out.println("Enter project end date (yyyyMMdd):");
            String endDate = scanner.nextLine();

            System.out.println("Enter number of project members:");
            int memberCount = Integer.parseInt(scanner.nextLine());

            ArrayList<String> members = new ArrayList<>();
            for (int j = 0; j < memberCount; j++) {
                System.out.println("Enter member name:");
                members.add(scanner.nextLine());
            }

            projects.add(new Project(name, startDate, endDate, members));
        }

        System.out.println("Enter the name of the member to search for their projects:");
        String memberToSearch = scanner.nextLine();

        // Display projects that the member is part of
        System.out.println("Projects involving " + memberToSearch + ":");
        for (Project project : projects) {
            if (project.hasMember(memberToSearch)) {
                System.out.println(project);
            }
        }

        // Display total number of projects and their durations
        System.out.println("Total number of projects: " + projects.size());
        for (Project project : projects) {
            System.out.printf("Project %s duration: %d days\n", project.getName(), project.getDuration());
        }

        scanner.close();
    }
}