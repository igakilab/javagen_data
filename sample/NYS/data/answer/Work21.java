public class Work21 {
  public static void main(String[] args) {
    // 変数を宣言，初期化する
    boolean student = true;
    int age = 24;
    double pai = 3.14;
    String msg = "java演習";
    // 出力
    System.out.println("msg=" + msg);
    System.out.println("student=" + student);
    System.out.println("私の年齢は=" + age);
    // age 再代入
    age = 30;
    System.out.println("---いや本当の年齢は" + age);
    System.out.println("π=" + pai);
    // e 再代入
    pai = 3.141592;

    System.out.println("---より正確には" + pai);
  }
}
