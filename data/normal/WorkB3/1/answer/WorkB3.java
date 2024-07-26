import java.util.ArrayList;
import java.util.Scanner;

public class WorkB3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> list = new ArrayList<>();

    // 入力受付
    System.out.println("整数を5つ入力してください。");
    for (int i = 0; i < 5; i++) {
      System.out.print((i+1) + "番目の整数: ");
      int number = scanner.nextInt(); // もしくは scanner.next()
      list.add(number);
    }

    // 調べる数の入力
    System.out.print("調べたい数を入力してください: ");
    int target = scanner.nextInt();

    // 指定された数のインデックスを調べる
    int index = list.indexOf(target);
    if (index != -1) {
      System.out.println("指定された数 " + target + " は、リストの位置 " + index + " にあります。");
    } else {
      System.out.println("指定された数 " + target + " は、リストにありません。");
    }

    scanner.close();
  }
}
