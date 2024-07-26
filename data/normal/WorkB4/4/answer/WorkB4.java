import java.util.ArrayList;
import java.util.Scanner;

public class WorkB4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        // Add elements to the ArrayList
        System.out.println("ArrayListに追加する5つの要素を入力してください:");
        for (int i = 0; i < 5; i++) {
            String element = scanner.nextLine();
            list.add(element);
        }

        // Print the ArrayList
        System.out.println("現在のArrayListの内容: " + list);

        // Check if an element exists in the ArrayList
        System.out.println("調べたい要素を入力してください:");
        String checkElement = scanner.nextLine();
        if (list.contains(checkElement)) {
            System.out.println(checkElement + "はArrayListに含まれています。");
        } else {
            System.out.println(checkElement + "はArrayListに含まれていません。");
        }

        // Remove an element from the ArrayList
        System.out.println("削除したい要素を入力してください:");
        String removeElement = scanner.nextLine();
        if (list.remove(removeElement)) {
            System.out.println(removeElement + "がArrayListから削除されました。");
        } else {
            System.out.println(removeElement + "はArrayListに存在しません。");
        }

        // Print the ArrayList again
        System.out.println("変更後のArrayListの内容: " + list);

        // Get an element by index and print it
        System.out.println("インデックスを入力して要素を取得します:");
        int index = scanner.nextInt();
        if (index >= 0 && index < list.size()) {
            System.out.println("インデックス" + index + "の要素は: " + list.get(index));
        } else {
            System.out.println("無効なインデックスです。");
        }

        scanner.close();
    }
}
