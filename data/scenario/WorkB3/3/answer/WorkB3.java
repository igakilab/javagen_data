import java.util.ArrayList;
import java.util.Scanner;

public class WorkB3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> studentNames = new ArrayList<>();
    ArrayList<Integer> studentScores = new ArrayList<>();

    // 学生の名前と成績の入力
    while (true) {
      System.out.println("学生の名前を入力してください（終了するにはendと入力）：");
      String name = scanner.next();
      if (name.equals("end")) {
        break;
      } else {
        studentNames.add(name);
        System.out.println(name + "の成績を入力してください：");
        int score = scanner.nextInt();
        studentScores.add(score);
      }
    }

    // 特定の学生の成績位置を調査
    System.out.println("成績を調べたい学生の名前を入力してください：");
    String searchName = scanner.next();
    int index = studentNames.indexOf(searchName);

    if (index != -1) {
      System.out.println(searchName + "の成績はリストの位置 " + index + " です。");
    } else {
      System.out.println(searchName + " はリストに存在しません。");
    }

    // 新しい成績の追加
    System.out.println("新しい学生の名前を入力してください：");
    String newName = scanner.next();
    studentNames.add(newName);
    System.out.println(newName + "の成績を入力してください：");
    int newScore = scanner.nextInt();
    studentScores.add(newScore);
    System.out.println(newName + "の成績を追加しました。");

    scanner.close();
  }
}
