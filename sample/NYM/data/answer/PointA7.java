public class PointA7 {
  private int hp = 100;

  //setHpメソッドを追加します。
  public void setHp(int hp) {
    this.hp = hp;
  }

  //getHpメソッドを追加します。
  public int getHp() {
    return this.hp;
  }

  //printHpメソッドを追加します。出力文には以下を利用します。
  public void printHp() {
    System.out.printf("HP=%3d\n", this.hp);
  }
}
