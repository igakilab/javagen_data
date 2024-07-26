import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        // ArrayListの作成
        ArrayList<Person> personList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // ユーザーから複数のPerson情報を取得し、ArrayListに追加
        while (true) {
            System.out.println("名前を入力してください（終了するには'end'と入力）：");
            String name = scanner.nextLine();

            // 終了条件
            if (name.equals("end")) {
                break;
            }

            System.out.println("年齢を入力してください：");
            int age = scanner.nextInt();
            scanner.nextLine();  // 次の入力を受け取る前にEnterキーを消費

            // 新しいPersonを作成してArrayListに追加
            personList.add(new Person(name, age));
        }

        // 追加されたPerson情報を表示
        for (int i = 0; i < personList.size(); i++) {
            Person person = personList.get(i);
            System.out.println("名前: " + person.getName() + ", 年齢: " + person.getAge());
        }

        // Scannerをクローズ
        scanner.close();
    }
}
