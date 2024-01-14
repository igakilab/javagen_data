public class WorkA7 {
  public static void main(String[] args) {
    //PointA7クラスのインスタンスpを生成します。
    PointA7 p = new PointA7();

    //printHpメソッドを用いてHPを出力します。
    p.printHp();

    //setHpメソッドを用いてHPを変更します。
    p.setHp(90);

    //getHPメソッドを用いてHPを出力します。出力には以下に必要なコードを追加して利用します。
    //System.out.printf("HPは%3dになりました。\n", );
    System.out.printf("HPは%3dになりました。\n", p.getHp());

    //printHpメソッドを用いてHPを出力します。
    p.printHp();
  }
}
