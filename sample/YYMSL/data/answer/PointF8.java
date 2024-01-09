class PointF8 {
    private int hp = 100;

    // int型の引数hpを持つコンストラクタを追加します。
    // 引数で受け取った値をsetHpメソッドを用いてフィールドに代入します。
    public PointF8(int hp) {
        setHp(hp);
    }

    // アクセス修飾子をprotectedに変更してsetHpメソッドを追加します。
    protected void setHp(int hp) {
        this.hp = hp;
    }


    // `printHp`メソッドはフィールド`hp`の値を出力します。
    public void printHp() {
        System.out.printf("HP=%3d\n", this.hp);
    }
}