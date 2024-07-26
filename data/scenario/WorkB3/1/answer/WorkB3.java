import java.util.ArrayList;
import java.util.Scanner;

public class WorkB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        // 初期値をリストに追加
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        // ユーザーに3つの番号を入力してもらう
        int[] userNumbers = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("番号を入力してください: ");
            userNumbers[i] = scanner.nextInt();
        }

        // 入力された番号がリストに含まれているかどうかを確認する
        for (int number : userNumbers) {
            if (list.indexOf(number) != -1) {
                System.out.printf("番号 %d はリストに含まれています。\n", number);
            } else {
                System.out.printf("番号 %d はリストに含まれていません。\n", number);
            }
        }

        scanner.close();
    }
}
