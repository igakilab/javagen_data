import java.util.Scanner;

public class WorkB5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 文字列の入力
        System.out.println("文字列を入力してください:");
        String inputStr = scanner.nextLine();

        // 検索文字列の入力
        System.out.println("検索したい文字列を入力してください:");
        String searchStr = scanner.nextLine();

        // 置換後の文字列の入力
        System.out.println("置換後の文字列を入力してください:");
        String replaceStr = scanner.nextLine();

        // 文字列検索
        if (inputStr.contains(searchStr)) {
            System.out.println("入力した文字列は検索文字列を含んでいます。");
            
            // 文字列置換
            String modifiedStr = inputStr.replace(searchStr, replaceStr);
            System.out.println("置換後の文字列は以下の通りです:\n" + modifiedStr);
        } else {
            System.out.println("入力した文字列は検索文字列を含んでいません。");
        }

        // 入力した文字列を大文字に変換
        System.out.println("全て大文字に変換した文字列は以下の通りです:\n" + inputStr.toUpperCase());

        // 入力した文字列を小文字に変換
        System.out.println("全て小文字に変換した文字列は以下の通りです:\n" + inputStr.toLowerCase());
        
        scanner.close();
    }
}
