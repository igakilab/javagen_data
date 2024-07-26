import java.util.Scanner;

public class WorkB5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("テキストを入力してください:");
        String text = scanner.nextLine();

        System.out.println("検索したい単語を入力してください:");
        String word = scanner.nextLine();

        // 検索処理
        if (text.contains(word)) {
            System.out.println("テキストに含まれている単語を見つけました。");

            // 置換処理
            String replacedText = text.replace(word, word.toUpperCase());
            System.out.println("置換後のテキスト:");
            System.out.println(replacedText);
        } else {
            System.out.println("テキストに単語は含まれていません。");
        }

        scanner.close();
    }
}
