import java.util.ArrayList;
import java.util.Scanner;

public class WorkB5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // エントリ数の入力
    System.out.print("エントリ数を入力してください: ");
    int entryCount = scanner.nextInt();
    scanner.nextLine(); // 改行を読み込む

    ArrayList<String> dates = new ArrayList<>();
    ArrayList<String> entries = new ArrayList<>();

    // エントリの入力
    for (int i = 0; i < entryCount; i++) {
      System.out.printf("日付 (%d): ", i + 1);
      String date = scanner.nextLine();
      dates.add(date);

      System.out.printf("内容 (%d): ", i + 1);
      String entry = scanner.nextLine();
      entries.add(entry);
    }

    // キーワードと置換文字列の入力
    System.out.print("検索対象のキーワードを入力してください: ");
    String keyword = scanner.nextLine();

    System.out.print("置換する文字列を入力してください: ");
    String replacement = scanner.nextLine();

    // キーワードを含むエントリの置換
    ArrayList<String> replacedEntries = new ArrayList<>();
    for (String entry : entries) {
      if (entry.contains(keyword)) {
        replacedEntries.add(entry.replace(keyword, replacement));
      } else {
        replacedEntries.add(entry);
      }
    }

    // 置換結果の表示
    System.out.println("置換結果:");
    for (int i = 0; i < entryCount; i++) {
      System.out.printf("日付: %s\n内容: %s\n", dates.get(i), replacedEntries.get(i));
      if (replacedEntries.get(i).contains(replacement)) {
        System.out.println("置換後のエントリに置換された文字列が含まれています。");
      } else {
        System.out.println("置換後のエントリに置換された文字列が含まれていません。");
      }
      System.out.println("----------");
    }

    // キーワードのリストアップ
    System.out.println("キーワードのリストアップ:");
    for (int i = 0; i < entryCount; i++) {
      if (entries.get(i).contains(keyword)) {
        System.out.printf("日付: %s\n内容: %s\n", dates.get(i), entries.get(i));
      }
    }

    scanner.close();
  }
}
