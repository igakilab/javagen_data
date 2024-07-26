import java.util.Scanner;

public class WorkB5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 元の文字列を入力
        System.out.println("元の文字列を入力してください:");
        String originalString = scanner.nextLine();
        
        // 検索する文字列を入力
        System.out.println("検索する文字列を入力してください:");
        String searchString = scanner.nextLine();

        // 置換後の文字を入力
        System.out.println("置換後の文字を入力してください:");
        String replaceString = scanner.nextLine();

        // 大文字に変換
        String upperCaseString = originalString.toUpperCase();
        System.out.println("大文字に変換: " + upperCaseString);

        // 小文字に変換
        String lowerCaseString = originalString.toLowerCase();
        System.out.println("小文字に変換: " + lowerCaseString);

        // 検索文字列の位置を確認
        int index = originalString.indexOf(searchString);

        // 検索結果を表示
        if (index != -1) {
            System.out.println("検索文字列 \"" + searchString + "\" は、元の文字列の位置 " + index + " にあります。");
        } else {
            System.out.println("検索文字列 \"" + searchString + "\" は元の文字列には含まれていません。");
        }

        // 文字列を置換
        String replacedString = originalString.replace(searchString, replaceString);
        System.out.println("置換後の文字列: " + replacedString);

        // Scannerを閉じる
        scanner.close();
    }
}
