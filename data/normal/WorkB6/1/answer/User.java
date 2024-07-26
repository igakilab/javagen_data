public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ユーザー情報を出力するメソッド
    public void printUserInfo() {
        System.out.printf("ユーザー名: %s, 年齢: %d%n", this.name, this.age);
    }

    // ユーザー名を取得するメソッド
    public String getName() {
        return this.name;
    }

    // ユーザーの年齢を取得するメソッド
    public int getAge() {
        return this.age;
    }
}
