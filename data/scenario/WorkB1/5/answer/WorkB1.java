import java.util.ArrayList;
import java.util.Scanner;

public class WorkB1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> titles = new ArrayList<>();
        ArrayList<String> genres = new ArrayList<>();
        ArrayList<Double> ratings = new ArrayList<>();
        
        System.out.print("映画の数を入力してください: ");
        int numMovies = scanner.nextInt();
        scanner.nextLine(); // 消費するラインの改行

        for (int i = 0; i < numMovies; i++) {
            System.out.print("映画のタイトルを入力してください: ");
            String title = scanner.nextLine();
            titles.add(title);

            System.out.print("映画のジャンルを入力してください: ");
            String genre = scanner.nextLine();
            genres.add(genre);

            System.out.print("映画の評価を入力してください (0.0〜10.0): ");
            double rating = scanner.nextDouble();
            ratings.add(rating);
            
            scanner.nextLine(); // 消費するラインの改行
        }
        scanner.close();
        
        // 集計
        ArrayList<String> uniqueGenres = new ArrayList<>();
        ArrayList<ArrayList<String>> genreTitles = new ArrayList<>();
        ArrayList<ArrayList<Double>> genreRatings = new ArrayList<>();

        for (int i = 0; i < genres.size(); i++) {
            String genre = genres.get(i);
            String title = titles.get(i);
            double rating = ratings.get(i);

            int index = uniqueGenres.indexOf(genre);
            if (index == -1) {
                uniqueGenres.add(genre);
                ArrayList<String> newTitleList = new ArrayList<>();
                newTitleList.add(title);
                genreTitles.add(newTitleList);

                ArrayList<Double> newRatingList = new ArrayList<>();
                newRatingList.add(rating);
                genreRatings.add(newRatingList);
            } else {
                genreTitles.get(index).add(title);
                genreRatings.get(index).add(rating);
            }
        }

        System.out.println("ジャンルごとの映画タイトルと平均評価:");
        for (int i = 0; i < uniqueGenres.size(); i++) {
            String genre = uniqueGenres.get(i);
            ArrayList<String> titlesInGenre = genreTitles.get(i);
            ArrayList<Double> ratingsInGenre = genreRatings.get(i);

            double sum = 0;
            for (int j = 0; j < ratingsInGenre.size(); j++) {
                sum += ratingsInGenre.get(j);
            }
            double average = sum / ratingsInGenre.size();

            System.out.println("ジャンル: " + genre);
            System.out.print("タイトル: ");
            for (String title : titlesInGenre) {
                System.out.print(title + " ");
            }
            System.out.printf("| 平均評価: %.2f%n", average);
        }
    }
}
