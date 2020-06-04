package classMethod.human;

public class Human03 {
    public String name;
    public int age;
    public String profession;

    public Human03() {
        this.name = "山田";
        this.age = 20;
        this.profession = "プログラマー";
    }

    // 修飾子とは、クラスやメソッド、フィールドなどの性質を指定するものです。大きく分けてアクセス修飾子とそれ以外の修飾子があります。
    // 修飾子 戻り値の型 メソッド名(引数) {
    //  メソッド内で宣言した変数は、「インスタンス変数」と区別するために「ローカル変数」と呼びます。
    // 処理
    // return 戻り値;

    public String getProfile() {
        // String型の戻り値を返す
        return "年齢は" + this.age + "、職業は" + this.profession;
    }

    public void greet(String friend) {
        if (friend == null) {
            System.out.println("挨拶する友達がわかりません！");
            // friendがnullの場合は、ここで処理を終了
            return;
        }
        System.out.println(friend + "さん、こんちには！");
    }
}

/* コンパイルの仕方
    ファイルのあるフォルダまで移動して、javac ファイル名.java
    このファイルの場合、humanフォルダまでカレントディレクトリを移動させて
    human $ javac Human03.java */