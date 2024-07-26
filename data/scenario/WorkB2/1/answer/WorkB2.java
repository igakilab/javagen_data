import java.util.ArrayList;
import java.util.Scanner;

public class WorkB2 {
    public static void main(String[] args) {
        // 初期の配列に要素を追加するための作業
        int[] integerArray = {1, 2, 3, 4, 5};
        int newElement = 6;
        int indexToRetrieve = 3; // 取得したいインデックス

        // 配列に要素を追加する方法（新しい配列を作成してコピー）
        int[] newArray = new int[integerArray.length + 1];
        for (int i = 0; i < integerArray.length; i++) {
            newArray[i] = integerArray[i];
        }
        newArray[integerArray.length] = newElement;

        // 特定のインデックスの値を取得して表示
        int retrievedValueFromArray = newArray[indexToRetrieve];
        System.out.println("配列から取得した値: " + retrievedValueFromArray);

        // ArrayListへの要素の追加と取得
        ArrayList<Integer> integerList = new ArrayList<>();
        for (int i : integerArray) {
            integerList.add(i);
        }
        integerList.add(newElement);

        // 特定のインデックスの値を取得して表示
        int retrievedValueFromList = integerList.get(indexToRetrieve);
        System.out.println("ArrayListから取得した値: " + retrievedValueFromList);
    }
}
