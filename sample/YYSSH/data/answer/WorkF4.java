public class WorkF4 {
    public static void main(String[] args) {
        // ユーザからの入力を取得するScannerクラスのインスタンスを生成
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        // 文字列の入力を促すメッセージを画面に表示
        System.out.println("文字列を入力してください。");
        // ユーザからの文字列の入力を受け取る
        String inputString = scanner.nextLine();
        // 入力された文字列を画面に表示
        System.out.println("入力された文字列：" + inputString);

        // Scannerクラスのインスタンスをクローズする
        scanner.close();
    }
}