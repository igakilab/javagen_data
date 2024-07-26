import java.util.ArrayList;
import java.util.Scanner;

public class WorkB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> shoppingList = new ArrayList<>();

        // ユーザーに買い物リストを入力させる
        System.out.println("買い物リストに追加したいアイテムを入力してください。（終了するには'終了'と入力してください）");
        while (true) {
            String item = scanner.nextLine();
            if (item.equals("終了")) {
                break;
            }
            shoppingList.add(item);
        }

        // 調査したいアイテムを入力してもらう
        System.out.print("リストの中にあるか調査したいアイテムを入力してください：");
        String searchItem = scanner.next(); // or scanner.nextLine()

        // アイテムがリストに含まれているかをチェックする
        int index = shoppingList.indexOf(searchItem);
        if (index != -1) {
            System.out.println(searchItem + " は買い物リストに含まれています。");
        } else {
            System.out.println(searchItem + " は買い物リストに含まれていません。");
        }

        scanner.close();
    }
}
