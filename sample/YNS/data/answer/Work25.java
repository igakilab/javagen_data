public class Work25 {
  public static void main(String[] args) {
    java.util.Scanner scanner = new java.util.Scanner(System.in);

    // System.out.println("1番目の文字列を入力してください。");
    String str1 = scanner.nextLine();

    // System.out.print("2番目の文字列を入力してください。");
    String str2 = scanner.nextLine();

    // 文字列比較
    if (str1.equals(str2)) {
      System.out.println("1番目と2番目の文字列は等しいです。");
    } else {
      System.out.println("1番目と2番目の文字列は違います。");
    }
    scanner.close();
  }
}
