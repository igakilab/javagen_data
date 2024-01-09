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

    // 戻り値なしで、int型の引数dhpを持つupdateメソッド。
    // 修飾子はpublic。
    // 受け取った値をフィールドhpの値に加える。
    public void update(int dhp) {
        this.hp += dhp;
    }

    // WorkA3.javaからgetHpメソッドをコピーして追加します。
    public int getHp() {
        return this.hp;
    }

    // WorkA3.javaからprintHpメソッドをコピーして追加します。
    public void printHp() {
        System.out.printf("HP=%3d\n", this.hp);
    }
}