import java.util.ArrayList;
import java.util.Scanner;

public class WorkB2 {
    public static void main(String[] args) {
        // 配列を使用した手法
        int[] array = new int[5];
        Scanner scanner = new Scanner(System.in);
        
        for (int i = 0; i < array.length; i++) {
            System.out.print("配列に追加する整数を入力してください: ");
            array[i] = scanner.nextInt();
        }

        System.out.println("配列の要素を出力します:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }

        // ArrayListを使用した手法
        ArrayList<Integer> arrayList = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            System.out.print("ArrayListに追加する整数を入力してください: ");
            int value = scanner.nextInt();
            arrayList.add(value);
        }

        System.out.println("ArrayListの要素を出力します:");
        for (int i = 0; i < 5; i++) {
            System.out.println("arrayList.get(" + i + ") = " + arrayList.get(i));
        }

        scanner.close();
    }
}
