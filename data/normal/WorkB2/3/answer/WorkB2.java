import java.util.ArrayList;

public class WorkB2 {
    public static void main(String[] args) {
        // 配列における要素の追加方法と取得方法
        int[] array = new int[5];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 10; // 要素の追加
        }

        System.out.println("配列の要素:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]); // 要素の取得
        }

        // ArrayListにおける要素の追加方法と取得方法
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arrayList.add(i * 10); // 要素の追加
        }

        System.out.println("ArrayListの要素:");
        for (int i = 0; i < 5; i++) {
            System.out.println("arrayList.get(" + i + ") = " + arrayList.get(i)); // 要素の取得
        }
    }
}
