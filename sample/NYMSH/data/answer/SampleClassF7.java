class SampleClassF7 {
  private String message;

  // デフォルトコンストラクタを追加します
  public SampleClassF7() {
    this.message = "Default constructor";
  }

  // パラメータ付きコンストラクタを追加します
  public SampleClassF7(String message) {
    this.message = message;
  }

  //メッセージ出力メソッドを追加します
  public void printMessage() {
    System.out.println(message);
  }
}