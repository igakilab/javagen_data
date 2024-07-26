import java.util.Scanner;

public class WorkB5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 文字列の入力を受け取る
    System.out.println("対象の文字列を入力してください:");
    String targetString = scanner.nextLine();
    
    // 検索文字列の入力を受け取る
    System.out.println("検索する文字列を入力してください:");
    String searchString = scanner.nextLine();
    
    // 置換文字列の入力を受け取る
    System.out.println("置換する文字列を入力してください:");
    String replaceString = scanner.nextLine();

    // 検索文字列が含まれているか確認
    if (targetString.contains(searchString)) {
      System.out.println("検索文字列が見つかりました。");
    } else {
      System.out.println("検索文字列が見つかりません。");
    }

    // 文字列の置換
    String replacedString = targetString.replace(searchString, replaceString);
    System.out.println("置換後の文字列: " + replacedString);

    // 部分文字列の取得
    int startIndex = Math.max(0, targetString.indexOf(searchString));
    int endIndex = startIndex + searchString.length();
    if (startIndex >= 0 && endIndex <= targetString.length()) {
      String substring = targetString.substring(startIndex, endIndex);
      System.out.println("部分文字列: " + substring);
    } else {
      System.out.println("部分文字列が取得できませんでした。");
    }

    // 文字列を大文字に変換
    String upperString = targetString.toUpperCase();
    System.out.println("大文字に変換: " + upperString);

    // 文字列を小文字に変換
    String lowerString = targetString.toLowerCase();
    System.out.println("小文字に変換: " + lowerString);

    scanner.close();
  }
}
