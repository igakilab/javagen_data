import java.util.ArrayList;
import java.util.Scanner;

public class WorkB4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> numberList = new ArrayList<>();

    System.out.println("5つの整数を入力してください。");

    // 5つの整数をリストに追加
    for (int i = 0; i < 5; i++) {
      numberList.add(scanner.nextInt());
    }

    System.out.println("削除したい整数を入力してください。");
    int numToRemove = scanner.nextInt();

    // リスト内の要素を調査して削除
    if (numberList.contains(numToRemove)) {
      numberList.remove((Integer) numToRemove);
      System.out.println(numToRemove + "はリストから削除されました。");
    } else {
      System.out.println(numToRemove + "はリストに存在しません。");
    }

    // リストの現在の状態を表示
    System.out.println("現在のリストの状態: ");
    for (int i = 0; i < numberList.size(); i++) {
      System.out.println(numberList.get(i));
    }

    scanner.close();
  }
}
