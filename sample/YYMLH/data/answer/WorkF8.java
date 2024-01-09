import java.util.Scanner;

public class WorkF8 {
    public static void main(String[] args) {
        PointF8 p;

        System.out.println("整数を1つ入力してください");
        // Scannerクラスを用いて1つの整数を入力し、
        //それを引数にしてPointクラスのインスタンスを生成します。
        Scanner sc = new Scanner(System.in);
        p = new PointF8(sc.nextInt());

        // printHpメソッドを用いてHPを出力します。
        p.printHp();

        // PointF8クラスのメソッドを用いてHPを変更します。
        p.update(-10);

        // printHpメソッドを用いてHPを出力します。
        p.printHp();

        // PointF8クラスのメソッドを用いてHPを変更します。
        p.update(-10);

        // printHpメソッドを用いてHPを出力します。
        p.printHp();

        // scannerクラスのインスタンスをクローズします。
        sc.close();
    }
}