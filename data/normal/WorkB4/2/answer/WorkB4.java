import java.util.ArrayList;
import java.util.Scanner;

public class WorkB4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> list = new ArrayList<>();

    System.out.println("ArrayListに追加する文字列を10個入力してください：");

    for (int i = 0; i < 10; i++) {
      System.out.print((i + 1) + "番目の文字列: ");
      list.add(scanner.next());
    }

    System.out.println("調べたい文字列を入力してください：");
    String searchStr = scanner.next();

    if (list.contains(searchStr)) {
      System.out.println("ArrayListには \"" + searchStr + "\" が含まれています。");
    } else {
      System.out.println("ArrayListには \"" + searchStr + "\" が含まれていません。");
    }

    System.out.println("削除したい文字列を入力してください：");
    String removeStr = scanner.next();

    if (list.contains(removeStr)) {
      list.remove(removeStr);
      System.out.println("\"" + removeStr + "\" を削除しました。");
    } else {
      System.out.println("ArrayListには \"" + removeStr + "\" が含まれていません。");
    }

    System.out.println("ArrayListの全要素：");
    for (int i = 0; i < list.size(); i++) {
      System.out.println((i + 1) + ": " + list.get(i));
    }

    scanner.close();
  }
}
