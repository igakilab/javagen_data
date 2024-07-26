import java.util.ArrayList;
import java.util.Scanner;

public class WorkB5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> sentences = new ArrayList<>();

    // 文章入力
    System.out.println("複数の文章を入力してください。終了したい場合は 'end' と入力してください。");
    while (true) {
      String sentence = scanner.nextLine();
      if (sentence.equals("end")) {
        break;
      }
      sentences.add(sentence);
    }

    // 検索キーワードと置換キーワードを入力
    System.out.print("検索キーワードを入力してください: ");
    String searchKeyword = scanner.nextLine();

    System.out.print("置換キーワードを入力してください: ");
    String replaceKeyword = scanner.nextLine();

    // 文章内の検索キーワードを置換
    System.out.println("置換後の文章は次の通りです:");
    for (String sentence : sentences) {
      if (sentence.contains(searchKeyword)) {
        sentence = sentence.replace(searchKeyword, replaceKeyword);
      }
      System.out.println(sentence);
    }

    scanner.close();
  }
}
