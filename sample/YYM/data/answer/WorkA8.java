import java.util.Scanner;

public class WorkA8 {
  public static void main(String[] args) {
    PointA8 p;

    System.out.println("整数を1つ入力してください");
    //Scannerクラスを用いて1つの整数を入力し、
    //それを引数にしてPointA8クラスのインスタンスpを生成します。
    Scanner sc = new Scanner(System.in);
    p = new PointA8(sc.nextInt());

    //printHpメソッドを用いてHPを出力します。
    p.printHp();

    //PointA8クラスのメソッドを用いてHPを変更します。
    p.update(-10);

    //printHpメソッドを用いてHPを出力します。
    p.printHp();

    //PointA8クラスのメソッドを用いてHPを変更します。
    p.update(-10);

    //printHpメソッドを用いてHPを出力します。
    p.printHp();

    //scannerクラスのインスタンスをクローズします。
    sc.close();
  }
}
