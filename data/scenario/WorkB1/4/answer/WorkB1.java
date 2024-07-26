import java.util.ArrayList;
import java.util.Scanner;

public class WorkB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> bookTitles = new ArrayList<>();
        ArrayList<Integer> bookPrices = new ArrayList<>();

        System.out.println("本の数を入力してください:");
        int numOfBooks = scanner.nextInt();
        scanner.nextLine();  // 改行を消費

        for (int i = 0; i < numOfBooks; i++) {
            System.out.println((i + 1) + "番目の本のタイトルを入力してください:");
            String title = scanner.nextLine();  // 本のタイトルを入力
            bookTitles.add(title);  // タイトルの追加

            System.out.println((i + 1) + "番目の本の価格を入力してください:");
            int price = scanner.nextInt();  // 価格を入力
            bookPrices.add(price);  // 価格の追加
            scanner.nextLine();  // 改行を消費
        }

        // 最も高価な本を探す
        int maxPrice = -1;
        int maxIndex = -1;
        for (int i = 0; i < numOfBooks; i++) {
            int price = bookPrices.get(i);  // 価格を取得
            if (price > maxPrice) {
                maxPrice = price;
                maxIndex = i;
            }
        }

        // 結果を表示
        if (maxIndex != -1) {
            System.out.println("最も高価な本のタイトルは: " + bookTitles.get(maxIndex));  // タイトルを取得して表示
        } else {
            System.out.println("本が入力されませんでした。");
        }

        scanner.close();  // Scannerを閉じる
    }
}
