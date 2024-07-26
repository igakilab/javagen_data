import java.util.ArrayList;
import java.util.Scanner;

public class WorkB3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> books = new ArrayList<>();

    while (true) {
      System.out.println("図書館管理システム:");
      System.out.println("1: 書籍を登録する");
      System.out.println("2: 書籍が登録されているか調査する");
      System.out.println("3: 終了する");
      System.out.print("選択してください (1/2/3): ");

      int choice = scanner.nextInt();
      scanner.nextLine(); // 改行を消費

      switch (choice) {
        case 1:
          System.out.print("登録する書籍名を入力してください: ");
          String bookToAdd = scanner.nextLine();
          books.add(bookToAdd);
          System.out.println("書籍が登録されました。");
          break;
        case 2:
          System.out.print("調査する書籍名を入力してください: ");
          String bookToCheck = scanner.nextLine();
          if (books.indexOf(bookToCheck) != -1) {
            System.out.println("その書籍は登録されています。");
          } else {
            System.out.println("その書籍は登録されていません。");
          }
          break;
        case 3:
          scanner.close();
          System.out.println("システムを終了します。");
          return;
        default:
          System.out.println("無効な選択肢です。もう一度お試しください。");
          break;
      }
    }
  }
}
