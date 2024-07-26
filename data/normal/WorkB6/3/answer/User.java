class User {
    private String name;

    // コンストラクタ
    public User(String name) {
        this.name = name;
    }

    // 名前取得メソッド
    public String getName() {
        return name;
    }

    // 名前設定メソッド
    public void setName(String name) {
        this.name = name;
    }
}