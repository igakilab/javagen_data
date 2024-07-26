import java.util.ArrayList;
import java.util.Scanner;

public class WorkB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("要素を追加します。整数を入力してください。(終了は-1)");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }

        System.out.println("調査する要素を入力してください。");
        int elementToFind = scanner.nextInt();

        int index = list.indexOf(elementToFind);
        if (index != -1) {
            System.out.println("要素 " + elementToFind + " はインデックス " + index + " に存在します。");
        } else {
            System.out.println("要素 " + elementToFind + " はリストに存在しません。");
        }

        scanner.close();
    }
}
