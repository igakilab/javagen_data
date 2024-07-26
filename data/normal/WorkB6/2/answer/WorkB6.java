import java.util.ArrayList;
import java.util.Scanner;

public class WorkB6 {
    public static void main(String[] args) {
        ArrayList<PersonB6> people = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        // Scannerを利用してユーザー入力を取得し、ArrayListに追加する
        System.out.println("Enter the number of people:");
        int numPeople = Integer.parseInt(sc.nextLine());
        
        for (int i = 0; i < numPeople; i++) {
            System.out.println("Enter name for person " + (i + 1) + ":");
            String name = sc.nextLine();
            System.out.println("Enter age for person " + (i + 1) + ":");
            int age = sc.nextInt();
            sc.nextLine(); // nextIntの後にnextLineを使用する場合は、バッファクリアが必要
            
            people.add(new PersonB6(name, age));
        }

        // サイズを表示
        System.out.println("Number of people added: " + people.size());
        
        // 動的にリストの操作を行う例としていくつかの要素を表示
        System.out.println("Entered People:");
        for (PersonB6 person : people) {
            System.out.printf("Name: %s, Age: %d\n", person.getName(), person.getAge());
        }
        
        // Scannerをクローズする
        sc.close();
    }
}