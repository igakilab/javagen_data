import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        while (true) {
            System.out.println("学生の名前を入力してください（終了するには 'exit' と入力）：");
            String name = scanner.nextLine();
            if (name.equals("exit")) {
                break;
            }

            System.out.println("学生の年齢を入力してください：");
            int age = scanner.nextInt();
            scanner.nextLine(); // スキャナのバッファをクリア

            students.add(new Student(name, age));
        }

        System.out.println("登録された学生の名前は以下の通りです：");
        for (Student student : students) {
            System.out.println(student.getName());
        }

        System.out.println("登録された学生の数：" + students.size());

        scanner.close();
    }
}