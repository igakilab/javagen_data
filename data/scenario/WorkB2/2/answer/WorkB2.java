import java.util.ArrayList;

public class WorkB2 {
    public static void main(String[] args) {
        // 配列に文字列を追加
        String[] array = new String[3];
        array[0] = "Apple";
        array[1] = "Banana";
        array[2] = "Cherry";
        
        // 配列の特定のインデックスの値を取得して表示
        System.out.println("Array element at index 1: " + array[1]);

        // ArrayListに文字列を追加
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dog");
        arrayList.add("Elephant");
        arrayList.add("Fox");
        
        // ArrayListの特定のインデックスの値を取得して表示
        System.out.println("ArrayList element at index 1: " + arrayList.get(1));
    }
}
