import java.util.ArrayList;
import java.util.Scanner;

public class WorkB1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Integer> myList = new ArrayList<>();

    // ユーザーから3つの整数を入力させ、それらをリストに追加
    for (int i = 0; i < 3; i++) {
      System.out.print((i + 1) + "つ目の整数を入力してください: ");
      int number = scanner.nextInt();
      myList.add(number);
    }

    // リストの要素を取得して表示する
    for (int i = 0; i < 3; i++) {
      System.out.printf("%dつ目の整数: %d%n", (i + 1), myList.get(i));
    }

    scanner.close();
  }
}