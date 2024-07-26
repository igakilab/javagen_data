import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        // ユーザー定義クラスUserのArrayListを作成します。
        ArrayList<User> userList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ユーザー名を入力してください(終了するには'終了'と入力): ");
            String userName = scanner.nextLine();

            if (userName.equals("終了")) {
                break;
            }

            System.out.println("年齢を入力してください: ");
            // https://stackoverflow.com/questions/1566994/how-do-i-pad-a-string-in-java
            int age = Integer.parseInt(scanner.nextLine());

            // 新しいユーザーを作成してリストに追加します。
            User newUser = new User(userName, age);
            userList.add(newUser);
        }

        // リストに含まれるすべてのユーザー情報を出力します。
        System.out.println("---- 登録されたユーザー情報 ----");
        for (User user : userList) {
            user.printUserInfo();
        }

        // 入力が終わった後scannerクラスのインスタンスをクローズします。
        scanner.close();

        System.out.println("登録ユーザー数: " + userList.size());
    }
}
