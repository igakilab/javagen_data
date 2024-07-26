import java.util.ArrayList;
import java.util.Scanner;

public class WorkB4 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    // 要素をArrayListに追加
    System.out.println("ArrayListに文字列を追加します。終了する場合は'end'と入力してください。");
    while (true) {
      System.out.print("文字列を入力: ");
      String input = scanner.next();
      if (input.equals("end")) {
        break;
      }
      list.add(input);
    }

    // ArrayListのサイズを表示
    System.out.println("ArrayListのサイズは: " + list.size());

    // 特定の要素がArrayListに含まれているか調べる
    System.out.print("検索する文字列を入力してください: ");
    String search = scanner.next();
    if (list.contains(search)) {
      System.out.println(search + " はArrayListに含まれています。");
    } else {
      System.out.println(search + " はArrayListに含まれていません。");
    }

    // ArrayListの全要素を表示
    System.out.println("ArrayListの全要素を表示します:");
    for (int i = 0; i < list.size(); i++) {
      System.out.println("要素 " + i + ": " + list.get(i));
    }

    // 要素の削除
    System.out.print("削除する文字列を入力してください: ");
    String toRemove = scanner.next();
    if (list.remove(toRemove)) {
      System.out.println(toRemove + " をArrayListから削除しました。");
    } else {
      System.out.println(toRemove + " はArrayListに存在しません。");
    }

    // ArrayListの要素表示
    System.out.println("現在のArrayListの要素:");
    for (int i = 0; i < list.size(); i++) {
      System.out.println("要素 " + i + ": " + list.get(i));
    }

    scanner.close();
  }
}
