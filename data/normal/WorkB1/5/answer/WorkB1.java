import java.util.ArrayList;
import java.util.Scanner;

public class WorkB1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Object> elements = new ArrayList<Object>();

    System.out.println("整数を入力してください。");
    int number = scanner.nextInt();
    elements.add(number);

    System.out.println("文字列を入力してください。");
    scanner.nextLine(); // consume the newline
    String str = scanner.nextLine();
    elements.add(str);

    System.out.println("もう一度整数を入力してください。");
    number = scanner.nextInt();
    elements.add(number);

    // 取得と表示
    System.out.println("ArrayListの要素を表示します:");
    for (int i = 0; i < 3; i++) {
      System.out.println(elements.get(i));
    }

    scanner.close();
  }
}
