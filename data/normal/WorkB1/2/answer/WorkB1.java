import java.util.ArrayList;
import java.util.Scanner;

public class WorkB1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Object> list = new ArrayList<>();

    // 要素の追加
    System.out.print("整数を入力してください: ");
    int num = scanner.nextInt();
    list.add(num);

    // Scanner.nextLine()を使用して次の入力を促進
    scanner.nextLine();

    System.out.print("文字列を入力してください: ");
    String str = scanner.nextLine();
    list.add(str);

    System.out.print("もう一つの文字列を入力してください: ");
    String str2 = scanner.nextLine();
    list.add(str2);

    // 要素の表示
    System.out.println("整数: " + list.get(0));
    System.out.println("最初の文字列: " + list.get(1));
    System.out.println("次の文字列: " + list.get(2));

    scanner.close();
  }
}