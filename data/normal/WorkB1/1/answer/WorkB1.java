import java.util.ArrayList;
import java.util.Scanner;

public class WorkB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Object> list = new ArrayList<>();
        
        // データをArrayListに追加
        System.out.print("整数を入力してください: ");
        int number = scanner.nextInt();  // 使用メソッド: java.util.Scanner.nextInt
        list.add(number);                // 使用メソッド: java.util.ArrayList.add

        scanner.nextLine(); // バッファクリア

        System.out.print("文字列を入力してください: ");
        String text = scanner.nextLine();  // 使用メソッド: java.util.Scanner.nextLine
        list.add(text);                    // 使用メソッド: java.util.ArrayList.add
        
        // データをArrayListから取得して表示
        int retrievedNumber = (int) list.get(0);  // 使用メソッド: java.util.ArrayList.get
        String retrievedText = (String) list.get(1);  // 使用メソッド: java.util.ArrayList.get
        
        // 結果表示
        System.out.println("取得した整数: " + retrievedNumber);
        System.out.println("取得した文字列: " + retrievedText);
        
        scanner.close();  // 使用メソッド: java.util.Scanner.close
    }
}
