import java.util.ArrayList;
import java.util.Scanner;

public class WorkB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> stringList = new ArrayList<>();

        // 3つの文字列をユーザーから入力させる
        for (int i = 0; i < 3; i++) {
            System.out.println((i + 1) + "番目の文字列を入力してください:");
            String input = scanner.next();
            stringList.add(input); // 入力された文字列をリストに追加
        }

        // 入力された文字列を表示する
        System.out.println("入力された文字列は以下の通りです:");
        for (int i = 0; i < 3; i++) {
            System.out.println(stringList.get(i)); // リストから文字列を取得して表示
        }

        scanner.close();
    }
}
