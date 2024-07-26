import java.util.ArrayList;
import java.util.Scanner;

public class WorkB2 {
    public static void main(String[] args) {
        // 配列の例
        int[] array = new int[5];
        
        // 配列に要素を追加
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        array[3] = 4;
        array[4] = 5;
        
        // 配列から要素を取得して表示
        System.out.println("Array elements:");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        
        // ArrayListの例
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        // ArrayListに要素を追加
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        
        // ArrayListから要素を取得して表示
        System.out.println("ArrayList elements:");
        int i = 0;
        while (true) {
            try {
                System.out.println(arrayList.get(i));
                i++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        
        // 追加機能：ユーザーからの入力を受け付けてArrayListに追加
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter numbers to add to the ArrayList (type 'end' to stop):");
        
        while (true) {
            String input = scanner.nextLine();
            
            if (input.equals("end")) {
                break;
            }
            
            try {
                int number = Integer.parseInt(input);
                arrayList.add(number);
            } catch (NumberFormatException e) {
                System.out.println("Please enter a valid number or 'end' to stop.");
            }
        }
        
        // ユーザーが追加した要素を含めてArrayListから要素を取得して表示
        System.out.println("Updated ArrayList elements:");
        i = 0;
        while (true) {
            try {
                System.out.println(arrayList.get(i));
                i++;
            } catch (IndexOutOfBoundsException e) {
                break;
            }
        }
        
        scanner.close();
    }
}
