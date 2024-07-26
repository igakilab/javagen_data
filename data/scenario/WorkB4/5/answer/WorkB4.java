import java.util.ArrayList;
import java.util.Scanner;

public class WorkB4 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> products = new ArrayList<>();
    ArrayList<Integer> prices = new ArrayList<>();

    while (true) {
      System.out.println("商品名を入力してください (終了する場合は 'exit' と入力): ");
      String product = scanner.next();
      if (product.equals("exit")) {
        break;
      }

      System.out.println("商品の価格を入力してください: ");
      int price = scanner.nextInt();

      // 商品と価格をリストに追加
      products.add(product);
      prices.add(price);

      System.out.println("削除したい商品名を入力してください (削除しない場合は 'skip' と入力): ");
      String removeProduct = scanner.next();
      if (products.contains(removeProduct)) {
        int index = products.indexOf(removeProduct);
        products.remove(index);
        prices.remove(index);
        System.out.println(removeProduct + "をリストから削除しました。");
      } else if(!removeProduct.equals("skip")){
        System.out.println(removeProduct + "はリストに含まれていません。");
      }

      System.out.println("現在のリスト:");
      for (int i = 0; i < products.size(); i++) {
        System.out.println(products.get(i) + ": " + prices.get(i) + "円");
      }
    }

    scanner.close();
  }
}
