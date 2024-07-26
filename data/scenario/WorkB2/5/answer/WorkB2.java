import java.util.ArrayList;
import java.util.Scanner;

public class WorkB2 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // 商品のリストを作成（ArrayListで管理）
    ArrayList<String> productList = new ArrayList<>();
    ArrayList<Double> priceList = new ArrayList<>();

    // 一部の商品を事前に追加
    productList.add("Laptop");
    priceList.add(1200.50);
    productList.add("Smartphone");
    priceList.add(800.75);
    productList.add("Headphones");
    priceList.add(150.25);
    productList.add("Keyboard");
    priceList.add(100.00);

    // 商品の追加
    System.out.println("新しい商品を追加してください。");
    for (int i = 0; i < 2; i++) { // ユーザーが追加できる商品数を2つとする
      System.out.print("商品名: ");
      String productName = scanner.next();

      System.out.print("価格: ");
      double productPrice = scanner.nextDouble();

      // 商品と価格をリストに追加
      productList.add(productName);
      priceList.add(productPrice);
    }

    // 特定商品の価格取得と表示
    System.out.print("価格を知りたい商品の名前を入力してください: ");
    String searchProduct = scanner.next();
    for (int i = 0; i < productList.size(); i++) {
      if (productList.get(i).equals(searchProduct)) {
        System.out.printf("商品 '%s' の価格は %.2f 円です。\n", searchProduct, priceList.get(i));
        break;
      }
    }

    // 合計金額と商品一覧の表示
    double total = 0.0;
    System.out.println("\nカートの内容:");
    for (int i = 0; i < productList.size(); i++) {
      System.out.printf("%s: %.2f 円\n", productList.get(i), priceList.get(i));
      total += priceList.get(i);
    }
    System.out.printf("\n合計金額: %.2f 円\n", total);

    // 最も高価な商品と最も低価な商品を表示
    String maxProduct = productList.get(0);
    String minProduct = productList.get(0);
    double maxPrice = priceList.get(0);
    double minPrice = priceList.get(0);

    for (int i = 1; i < productList.size(); i++) {
      if (priceList.get(i) > maxPrice) {
        maxPrice = priceList.get(i);
        maxProduct = productList.get(i);
      }
      if (priceList.get(i) < minPrice) {
        minPrice = priceList.get(i);
        minProduct = productList.get(i);
      }
    }

    System.out.printf("\n最も高価な商品: %s (%.2f 円)\n", maxProduct, maxPrice);
    System.out.printf("最も低価な商品: %s (%.2f 円)\n", minProduct, minPrice);

    // スキャナーを閉じる
    scanner.close();
  }
}
