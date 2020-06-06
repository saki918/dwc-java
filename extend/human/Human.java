package extend.human;

public class Human {
    // privateは自分自身からのみアクセス可能
    private String name;
    // protectedはサブクラスからもアクセス可能
    protected int age;

    // コンストラクタ
    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // ゲッター
    public String getName() {
        return this.name;
    }

    // ゲッター
    public int getAge() {
        return this.age;
    }
}