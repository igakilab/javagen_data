import java.util.ArrayList;
import java.util.Scanner;

public class WorkB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // 要素を入力
        System.out.println("要素を入力してください（終了するには-1を入力）：");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }

        // 調査する数を入力
        System.out.println("調査する数を入力してください：");
        int number = scanner.nextInt();

        // 指定した数のインデックスを調査
        int index = list.indexOf(number);
        if (index != -1) {
            System.out.printf("数 %d はインデックス %d に存在します。%n", number, index);
        } else {
            System.out.printf("数 %d はリストに存在しません。%n", number);
        }

        scanner.close();
    }
}
