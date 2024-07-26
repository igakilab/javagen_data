import java.util.Scanner;

public class WorkB5 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 文字列の入力
    System.out.println("文字列を入力してください：");
    String input = scanner.nextLine();
    
    // 部分文字列の検索
    System.out.println("検索したい文字列を入力してください：");
    String searchString = scanner.nextLine();
    
    // 検索方法の選択
    System.out.println("検索方法を選んでください (1: indexOf, 2: contains)：");
    int searchMethod = scanner.nextInt();
    scanner.nextLine(); // 改行を消費
    
    boolean found = false;
    switch(searchMethod) {
      case 1:
        found = input.indexOf(searchString) != -1;
        break;
      case 2:
        found = input.contains(searchString);
        break;
      default:
        System.out.println("無効な選択です");
        scanner.close();
        return;
    }

    if (found) {
      System.out.println("文字列が見つかりました。");
    } else {
      System.out.println("文字列が見つかりませんでした。");
    }

    // 文字列の置換
    System.out.println("置換したい文字列を入力してください：");
    String replaceString = scanner.nextLine();
    
    System.out.println("新しい文字列を入力してください：");
    String newString = scanner.nextLine();
    
    String replacedString = input.replace(replaceString, newString);
    System.out.println("置換後の文字列：");
    System.out.println(replacedString);

    // 大文字・小文字変換
    System.out.println("文字列の大文字小文字を変換します。");
    System.out.println("1: 大文字, 2: 小文字");
    int caseOption = scanner.nextInt();
    
    switch(caseOption) {
      case 1:
        System.out.println(input.toUpperCase());
        break;
      case 2:
        System.out.println(input.toLowerCase());
        break;
      default:
        System.out.println("無効な選択です");
    }

    scanner.close();
  }
}
