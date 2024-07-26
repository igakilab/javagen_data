class Book {
    private String title;
    private String author;

    // コンストラクタ
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // タイトルの取得
    public String getTitle() {
        return title;
    }

    // 著者の取得
    public String getAuthor() {
        return author;
    }
}