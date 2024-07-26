import java.util.Scanner;

public class WorkB5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("文字列を入力してください: ");
    String inputString = scanner.nextLine();

    System.out.println("検索したい文字列を入力してください: ");
    String searchString = scanner.nextLine();

    System.out.println("置換後の文字列を入力してください: ");
    String replaceString = scanner.nextLine();

    // 文字列の検索
    if (inputString.contains(searchString)) {
      System.out.println("入力された文字列に検索文字列が見つかりました。");
    } else {
      System.out.println("入力された文字列に検索文字列が見つかりませんでした。");
    }

    // 文字列の置換
    String resultString = inputString.replace(searchString, replaceString);
    System.out.println("置換後の文字列: " + resultString);

    // 大文字への変換
    String upperCaseString = inputString.toUpperCase();
    System.out.println("大文字に変換: " + upperCaseString);

    // 小文字への変換
    String lowerCaseString = inputString.toLowerCase();
    System.out.println("小文字に変換: " + lowerCaseString);

    scanner.close();
  }
}
