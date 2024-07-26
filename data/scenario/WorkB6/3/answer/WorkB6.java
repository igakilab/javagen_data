import java.util.ArrayList;
import java.util.Scanner;

// メインクラス: WorkB6
public class WorkB6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Movie> movies = new ArrayList<>();

        // 映画情報を追加する
        movies.add(new Movie("Inception", "Christopher Nolan", 148));
        movies.add(new Movie("Interstellar", "Christopher Nolan", 169));
        movies.add(new Movie("The Dark Knight", "Christopher Nolan", 152));
        movies.add(new Movie("Pulp Fiction", "Quentin Tarantino", 154));
        movies.add(new Movie("Kill Bill", "Quentin Tarantino", 111));

        // 特定の監督名の映画を表示する
        System.out.println("検索したい監督名を入力してください:");
        String directorName = sc.nextLine();
        
        System.out.println(String.format("\"%s\"監督の映画:", directorName));
        for (int i = 0; i < movies.size(); i++) {
            Movie movie = movies.get(i);
            if (movie.getDirector().equals(directorName)) {
                System.out.println(movie);
            }
        }

        // Scannerをクローズする
        sc.close();
    }
}