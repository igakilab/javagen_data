import java.util.ArrayList;
import java.util.Scanner;

public class WorkB1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    ArrayList<Object> list = new ArrayList<>();

    // 要素の追加
    System.out.print("整数を入力してください: ");
    int intValue = scanner.nextInt();
    list.add(intValue);

    System.out.print("文字列を入力してください: ");
    String stringValue = scanner.next();
    list.add(stringValue);

    // 要素の取得と表示
    System.out.printf("1番目の要素 (整数): %d%n", (int) list.get(0));
    System.out.printf("2番目の要素 (文字列): %s%n", (String) list.get(1));
  
    scanner.close();
  }
}
