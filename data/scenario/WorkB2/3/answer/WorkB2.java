import java.util.ArrayList;
import java.util.Scanner;

public class WorkB2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 配列を使用した場合
        String[] namesArray = new String[10]; // 大きさを固定した配列
        namesArray[0] = "Alice";
        namesArray[1] = "Bob";
        int arrayIndex = 2;
        
        // 新しい名前を追加
        System.out.println("配列に追加する名前を入力してください: ");
        String newNameArray = scanner.nextLine();

        // 配列に名前を追加
        if (arrayIndex < namesArray.length) {
            namesArray[arrayIndex] = newNameArray;
            arrayIndex++;
        } else {
            System.out.println("配列の容量がいっぱいです。");
        }

        // 特定のインデックスの名前を取得して表示 (例: インデックス1)
        System.out.println("配列のインデックス1の名前: " + namesArray[1]);

        // 配列の全ての名前を表示
        System.out.println("配列の全ての名前: ");
        for (int i = 0; i < arrayIndex; i++) {
            System.out.println(namesArray[i]);
        }

        // ArrayListを使用した場合
        ArrayList<String> namesList = new ArrayList<>();
        namesList.add("Alice");
        namesList.add("Bob");
        
        // 新しい名前を追加
        System.out.println("ArrayListに追加する名前を入力してください: ");
        String newNameList = scanner.nextLine();
        namesList.add(newNameList);

        // 特定のインデックスの名前を取得して表示 (例: インデックス1)
        System.out.println("ArrayListのインデックス1の名前: " + namesList.get(1));

        // ArrayListの全ての名前を表示
        System.out.println("ArrayListの全ての名前: ");
        for (String name : namesList) {
            System.out.println(name);
        }

        scanner.close();
    }
}
