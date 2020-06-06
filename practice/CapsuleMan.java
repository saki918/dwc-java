package practice;

public class CapsuleMan {
    private String name;
    private int age;

    // コンストラクタ
    public CapsuleMan(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ゲッター 実行ファイルからプライベートフィールドが呼ばれた時使うメソッド
    public String getName() {
      return this.name;
    }

    // セッター 実行ファイルから値をもらって来る(変更)時に使用
    public void setAge(int age) {
      this.age = age;
    }

    // ゲッター
    public int getAge() {
      return this.age;
    }
}