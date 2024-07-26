import java.util.ArrayList;
import java.util.Scanner;

public class WorkB5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 文章の数を尋ねる
    System.out.println("いくつの文章を入力しますか？");
    int numberOfSentences = scanner.nextInt();
    scanner.nextLine(); // 改行を消費

    // 文章を格納するリスト
    ArrayList<String> sentences = new ArrayList<>();

    // 文章を入力させる
    for (int i = 0; i < numberOfSentences; i++) {
      System.out.println("文章を入力してください:");
      sentences.add(scanner.nextLine());
    }

    // 検索キーワードを入力させる
    System.out.println("検索キーワードを入力してください:");
    String keyword = scanner.nextLine();

    // キーワードを含む文章を表示する
    System.out.println("キーワードを含む文章:");
    for (String sentence : sentences) {
      if (sentence.contains(keyword)) {
        System.out.println(sentence);
      }
    }

    // 必ず使用するメソッドのためのコード
    // 入力した文章を大文字に変換して表示
    System.out.println("入力された文章（大文字変換）:");
    for (String sentence : sentences) {
      System.out.println(sentence.toUpperCase());
    }

    scanner.close();
  }
}
