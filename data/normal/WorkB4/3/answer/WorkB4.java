import java.util.ArrayList;
import java.util.Scanner;

public class WorkB4 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<String>();
    Scanner scanner = new Scanner(System.in);
    int choice;

    do {
      System.out.println("メニュー:");
      System.out.println("1. 要素を追加");
      System.out.println("2. 要素を削除");
      System.out.println("3. 要素を表示");
      System.out.println("4. 特定の要素が含まれているか調べる");
      System.out.println("5. 終了");
      System.out.print("選択してください: ");
      choice = scanner.nextInt();
      scanner.nextLine(); // 改行を消費

      switch (choice) {
        case 1:
          System.out.print("追加したい要素を入力: ");
          String elementToAdd = scanner.nextLine();
          list.add(elementToAdd);
          System.out.println(elementToAdd + " を追加しました。");
          break;

        case 2:
          System.out.print("削除したい要素を入力: ");
          String elementToRemove = scanner.nextLine();
          if (list.contains(elementToRemove)) {
            list.remove(elementToRemove);
            System.out.println(elementToRemove + " を削除しました。");
          } else {
            System.out.println("要素が見つかりませんでした。");
          }
          break;

        case 3:
          System.out.println("現在の要素一覧:");
          for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
          }
          break;

        case 4:
          System.out.print("調べたい要素を入力: ");
          String elementToCheck = scanner.nextLine();
          if (list.contains(elementToCheck)) {
            System.out.println(elementToCheck + " はリストに含まれています。");
          } else {
            System.out.println(elementToCheck + " はリストに含まれていません。");
          }
          break;

        case 5:
          System.out.println("プログラムを終了します。");
          break;

        default:
          System.out.println("無効な選択です。再度選択してください。");
          break;
      }
    } while (choice != 5);

    scanner.close();
  }
}
