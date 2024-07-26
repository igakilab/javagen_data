import java.util.ArrayList;
import java.util.Scanner;

public class WorkB4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        // ユーザーに3つの名前を入力させる
        System.out.println("3つの名前を入力してください：");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + "つ目の名前: ");
            names.add(scanner.next());
        }

        // 確認したい名前を入力させる
        System.out.print("確認したい名前を入力してください：");
        String nameToCheck = scanner.next();

        // 名前が含まれているかを確認
        if (names.contains(nameToCheck)) {
            System.out.println(nameToCheck + " はリストに含まれています。");
            names.remove(nameToCheck);
            System.out.println(nameToCheck + " をリストから削除しました。");
        } else {
            System.out.println(nameToCheck + " はリストに含まれていません。");
        }

        // リストの残りの要素を表示
        System.out.println("リストの残りの要素：");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(names.get(i));
        }

        scanner.close();
    }
}
