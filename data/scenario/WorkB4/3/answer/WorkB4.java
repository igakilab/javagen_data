import java.util.ArrayList;
import java.util.Scanner;

public class WorkB4 {
    public static void main(String[] args) {
        ArrayList<String> cities = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // 都市の名前を複数入力させる
        System.out.println("都市の名前を複数入力してください。(終了するには 'end' を入力)");
        while (true) {
            String city = scanner.next();
            if (city.equals("end")) {
                break;
            }
            cities.add(city);
        }

        // 都市がリストに含まれているか確認
        System.out.println("リストから確認したい都市の名前を入力してください:");
        String checkCity = scanner.next();
        
        if (cities.contains(checkCity)) {
            System.out.println(checkCity + " はリストに含まれています。削除します。");
            cities.remove(checkCity);
        } else {
            System.out.println(checkCity + " はリストに含まれていません。");
        }

        // リスト内のすべての都市を表示
        System.out.println("現在の都市リスト:");
        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i));
        }

        // Scanner を閉じる
        scanner.close();
    }
}
