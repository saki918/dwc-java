package extend.human;

// 実行ファイル(mainメソッドを持つ)がコンパイルされればクラスのファイルも自動的にコンパイルされる。
// Humanクラスを継承したStudentクラス
public class Student extends Human {
    // サブクラスで追加したフィールド
    private int score;

    public Student(String name, int age, int score) {
        // スーパークラス(Human)のコンストラクタを呼び出し(必ず一番上)
        super(name, age);
        this.score = score;
    }

    // サブクラスで追加したメソッド
    public String getStudentProfile() {
        // 親インスタンス(Human)のフィールドをsuper変数で参照
        String profile = "年齢は" + super.age + "です。";
        profile += "学生で、テストの点数は" + this.score + "点です。";
        return profile;
    }
}