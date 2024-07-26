import java.util.ArrayList;
import java.util.Scanner;

// メインクラス
public class WorkB6 {
    public static void main(String[] args) {
        // Scanner準備
        Scanner scanner = new Scanner(System.in);

        // Userクラスのインスタンスを格納するArrayListを作成
        ArrayList<User> users = new ArrayList<>();

        // データ入力ループ
        while (true) {
            System.out.print("名前を入力してください（終了する場合は'q'と入力）：");
            String input = scanner.nextLine();

            if (input.equals("q")) {
                break; // 'q'が入力されたらループを終了
            }

            // 入力された名前でUserオブジェクトを作成、ArrayListに追加
            users.add(new User(input));
        }

        // ArrayListの内容を表示
        System.out.println("\n入力されたユーザー一覧：");
        for (int i = 0; i < users.size(); i++) {
            System.out.println("ユーザー " + (i + 1) + ": " + users.get(i).getName());
        }

        // Scannerをクローズ
        scanner.close();
    }
}