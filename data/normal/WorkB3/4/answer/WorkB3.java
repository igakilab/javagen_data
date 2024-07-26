import java.util.ArrayList;
import java.util.Scanner;

public class WorkB3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        // 要素をリストに追加
        System.out.println("リストに追加する要素を入力してください。終了するには'END'と入力してください。");
        while (true) {
            String input = scanner.next();
            if (input.equals("END")) {
                break;
            }
            list.add(input);
        }

        // 要素がリストに含まれているか調査
        System.out.println("調査する要素を入力してください。");
        String elementToFind = scanner.next();
        
        int index = list.indexOf(elementToFind);
        if (index != -1) {
            System.out.println("要素 '" + elementToFind + "' がリストのインデックス " + index + " に見つかりました。");
        } else {
            System.out.println("要素 '" + elementToFind + "' がリストに見つかりませんでした。");
        }

        scanner.close();
    }
}
