import java.util.ArrayList;
import java.util.Scanner;

public class WorkB4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // 要素をArrayListに追加
        System.out.println("数値を入力してください（終了するには-1を入力）：");
        while (true) {
            int input = scanner.nextInt();
            if (input == -1) {
                break;
            }
            list.add(input);
        }

        // ArrayListの要素数を出力
        System.out.printf("ArrayListの要素数: %d\n", list.size());
        
        // ArrayListに特定の値が含まれるかどうかを調査
        System.out.println("調査したい値を入力してください：");
        int valueToCheck = scanner.nextInt();
        if (list.contains(valueToCheck)) {
            System.out.println("ArrayListに含まれています。");
        } else {
            System.out.println("ArrayListに含まれていません。");
        }

        // ArrayListから特定の値を削除
        System.out.println("削除したい値を入力してください：");
        int valueToRemove = scanner.nextInt();
        boolean removed = list.remove((Integer) valueToRemove);
        
        if (removed) {
            System.out.println("値が削除されました。");
        } else {
            System.out.println("値が見つかりませんでした。");
        }

        // ArrayListの内容を出力
        System.out.println("現在のArrayListの内容：");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        scanner.close();
    }
}
