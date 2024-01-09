public class WorkF5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("テキスト１を入力してください：");
        String text1 = scanner.nextLine();

        System.out.println("テキスト２を入力してください：");
        String text2 = scanner.nextLine();

        System.out.println("テキスト３を入力してください：");
        String text3 = scanner.nextLine();

        System.out.println("テキスト４を入力してください：");
        String text4 = scanner.nextLine();

        scanner.close();

        System.out.println("テキスト１：" + text1);
        System.out.println("テキスト２：" + text2);
        System.out.println("テキスト３：" + text3);
        System.out.println("テキスト４：" + text4);
    }
}