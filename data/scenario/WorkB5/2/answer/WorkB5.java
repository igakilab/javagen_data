import java.util.Scanner;

public class WorkB5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // テキスト入力
        System.out.println("テキストを入力してください:");
        String text = scanner.nextLine();

        // 検索する文字列入力
        System.out.println("検索する文字列を入力してください:");
        String searchString = scanner.nextLine();

        // 検索する文字列がテキストに含まれているか確認
        if (text.contains(searchString)) {
            int index = text.indexOf(searchString);
            String result = text.substring(index);
            System.out.println("結果: " + result);
        } else {
            System.out.println("エラー: テキストに指定された文字列が含まれていません。");
        }

        scanner.close();
    }
}
