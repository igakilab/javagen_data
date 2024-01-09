public class WorkF5 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);

        String[] strings = new String[2];
        for (int i = 0; i < strings.length; i++) {
            strings[i] = scanner.nextLine();
        }

        if (strings[0].equals(strings[1])) {
            System.out.println("1番目と2番目の文字列は等しいです。");
        } else {
            System.out.println("1番目と2番目の文字列は違います。");
        }

        scanner.close();
    }
}