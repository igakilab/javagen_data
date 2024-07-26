import java.util.ArrayList;
import java.util.Scanner;

public class WorkB4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> integerList = new ArrayList<>();
    
    // ユーザーに5つの整数を入力させ、リストに追加
    System.out.println("5つの整数を入力してください。");
    for (int i = 0; i < 5; i++) {
      int number = scanner.nextInt();
      integerList.add(number);
    }

    // 検索する整数を入力
    System.out.print("リストから削除したい整数を入力してください: ");
    int target = scanner.nextInt();

    // 指定された整数がリストに含まれるかチェック
    if (integerList.contains(target)) {
      System.out.println(target + "はリストに含まれているので削除します。");
      while (integerList.contains(target)) {
        integerList.remove((Integer) target);
      }
    } else {
      System.out.println(target + "はリストに含まれていません。");
    }

    // 残った整数を表示
    System.out.println("リストに残っている整数は以下の通りです:");
    for (int i = 0; i < integerList.size(); i++) {
      System.out.println(integerList.get(i));
    }

    // scannerを閉じる
    scanner.close();
  }
}
