import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("本のタイトルを入力してください (終了するには 'exit' と入力):");
            String title = scanner.nextLine();
            
            if (title.equals("exit")) {
                break;
            }

            System.out.println("本の著者を入力してください:");
            String author = scanner.nextLine();

            Book book = new Book(title, author);
            books.add(book);
        }

        // 追加された全ての本のタイトルを表示
        System.out.println("追加された全ての本のタイトル:");
        for (int i = 0; i < books.size(); i++) {
            System.out.println(books.get(i).getTitle());
        }

        // Scannerを閉じます。
        scanner.close();
    }
}