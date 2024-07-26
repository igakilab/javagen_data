import java.util.ArrayList;
import java.util.Scanner;

public class WorkB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> list = new ArrayList<>();

        // 要素の追加
        System.out.println("整数を入力してください:");
        int intValue = scanner.nextInt();
        list.add(intValue);

        System.out.println("文字列を入力してください:");
        String str = scanner.next();
        list.add(str);

        // 要素の取得
        System.out.println("リストの1番目の要素 (整数): " + list.get(0));
        System.out.println("リストの2番目の要素 (文字列): " + list.get(1));

        scanner.close();
    }
}
