import java.util.ArrayList;
import java.util.Scanner;

public class WorkB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        // 要素を追加する
        System.out.println("ArrayListに要素を追加します。終了するには'0'を入力してください:");
        while (true) {
            String input = scanner.next();
            if (input.equals("0")) {
                break;
            }
            list.add(input);
        }

        // 調査する要素を入力させる
        System.out.println("調査する要素を入力してください:");
        String element = scanner.next();

        // 要素のインデックスを取得する
        int index = list.indexOf(element);
        if (index != -1) {
            System.out.println(element + " はリストのインデックス " + index + " に存在します。");
        } else {
            System.out.println(element + " はリストに存在しません。");
        }

        scanner.close();
    }
}
