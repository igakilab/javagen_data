import java.util.ArrayList;

public class WorkB2 {
  public static void main(String[] args) {
    // 配列の要素追加と取得
    int[] array = new int[5];
    array[0] = 10;
    array[1] = 20;
    array[2] = 30;
    array[3] = 40;
    array[4] = 50;

    System.out.println("Array elements:");
    for (int i = 0; i < array.length; i++) {
      System.out.println("Element at index " + i + ": " + array[i]);
    }

    // ArrayListの要素追加と取得
    ArrayList<Integer> arrayList = new ArrayList<>();
    arrayList.add(10); // java.util.ArrayList.add
    arrayList.add(20);
    arrayList.add(30);
    arrayList.add(40);
    arrayList.add(50);

    System.out.println("\nArrayList elements:");
    for (int i = 0; i < 5; i++) {
      System.out.println("Element at index " + i + ": " + arrayList.get(i)); // java.util.ArrayList.get
    }
  }
}
