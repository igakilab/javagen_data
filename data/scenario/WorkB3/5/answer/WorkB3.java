import java.util.ArrayList;
import java.util.Scanner;

public class WorkB3 {
    public static void main(String[] args) {
        ArrayList<Employee> employeeList = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // サンプルデータの追加
        employeeList.add(new Employee("田中", "2000-01-15", "営業", "主任"));
        employeeList.add(new Employee("鈴木", "2005-02-20", "総務", "係長"));
        employeeList.add(new Employee("佐藤", "2010-03-25", "開発", "課長"));

        boolean running = true;
        while (running) {
            System.out.println("1: 社員を検索 | 2: 役職を更新 | 3: 一覧表示 | 4: 終了");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("社員名を入力してください：");
                    String searchName = scanner.next();
                    int index = employeeList.indexOf(new Employee(searchName));
                    if (index != -1) {
                        System.out.println("社員情報：" + employeeList.get(index));
                    } else {
                        System.out.println("社員が見つかりません。");
                    }
                    break;

                case 2:
                    System.out.println("社員名を入力してください：");
                    String nameToUpdate = scanner.next();
                    int updateIndex = employeeList.indexOf(new Employee(nameToUpdate));
                    if (updateIndex != -1) {
                        System.out.println("新しい役職を入力してください：");
                        String newPosition = scanner.next();
                        employeeList.get(updateIndex).setPosition(newPosition);
                        System.out.println("役職を更新しました：" + employeeList.get(updateIndex));
                    } else {
                        System.out.println("社員が見つかりません。");
                    }
                    break;

                case 3:
                    System.out.println("全社員情報：");
                    for (Employee emp : employeeList) {
                        System.out.println(emp);
                    }
                    break;

                case 4:
                    running = false;
                    break;

                default:
                    System.out.println("無効な選択です。もう一度入力してください。");
                    break;
            }
        }

        scanner.close();
    }
}