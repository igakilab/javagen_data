import java.util.ArrayList;
import java.util.Scanner;

public class WorkB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> studentNames = new ArrayList<>();
        ArrayList<Integer> studentAges = new ArrayList<>();

        System.out.print("学生の人数を入力してください: ");
        int numberOfStudents = scanner.nextInt();
        scanner.nextLine(); // nextInt()の後の改行を消費

        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("学生%dの名前を入力してください: ", i + 1);
            String name = scanner.nextLine();
            studentNames.add(name);

            System.out.printf("学生%dの年齢を入力してください: ", i + 1);
            int age = scanner.nextInt();
            studentAges.add(age);
            scanner.nextLine(); // nextInt()の後の改行を消費
        }

        System.out.println("すべての学生の情報:");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.printf("学生%d - 名前: %s, 年齢: %d\n", i + 1, studentNames.get(i), studentAges.get(i));
        }

        scanner.close();
    }
}
