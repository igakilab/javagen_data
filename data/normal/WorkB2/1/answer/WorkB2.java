import java.util.ArrayList;

public class WorkB2 {
  public static void main(String[] args) {
    // 配列の例
    int[] array = new int[5]; // サイズ5の配列を作成
    for (int i = 0; i < 5; i++) {
      array[i] = i * 10; // 要素に値を追加
    }

    System.out.println("Array elements:");
    for (int i = 0; i < 5; i++) {
      System.out.println("Element at index " + i + ": " + array[i]); // 要素を取得して出力
    }

    // ArrayListの例
    ArrayList<Integer> arrayList = new ArrayList<>(); // ArrayListを作成
    for (int i = 0; i < 5; i++) {
      arrayList.add(i * 10); // 要素に値を追加
    }

    System.out.println("\nArrayList elements:");
    for (int i = 0; i < 5; i++) {
      System.out.println("Element at index " + i + ": " + arrayList.get(i)); // 要素を取得して出力
    }
  }
}
