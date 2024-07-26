import java.util.ArrayList;
import java.util.Scanner;

public class WorkB2 {
    public static void main(String[] args) {
        // 学生名リスト
        String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eve"};
        // 学生の点数リストのためのArrayList
        ArrayList<Integer> studentScores = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        // 各学生の点数を追加するループ
        for (int i = 0; i < studentNames.length; i++) {
            System.out.print("Enter the score for " + studentNames[i] + ": ");
            int score = scanner.nextInt();
            studentScores.add(score); // ArrayListに点数を追加
        }

        // 最高点と最低点を求めるための初期設定
        int maxScore = Integer.MIN_VALUE;
        int minScore = Integer.MAX_VALUE;
        String maxScoreStudent = "";
        String minScoreStudent = "";

        // 最高点と最低点を求める
        for (int i = 0; i < studentNames.length; i++) {
            int score = studentScores.get(i); // ArrayListから点数を取得
            if (score > maxScore) {
                maxScore = score;
                maxScoreStudent = studentNames[i];
            }
            if (score < minScore) {
                minScore = score;
                minScoreStudent = studentNames[i];
            }
        }

        // 全学生の名前と点数を表示
        System.out.println("\n--- Student Scores ---");
        for (int i = 0; i < studentNames.length; i++) {
            System.out.println(studentNames[i] + ": " + studentScores.get(i));
        }

        // 最高点と最低点の学生を表示
        System.out.println("\nHighest Score: " + maxScore + " by " + maxScoreStudent);
        System.out.println("Lowest Score: " + minScore + " by " + minScoreStudent);

        // スキャナーを閉じる
        scanner.close();
    }
}
