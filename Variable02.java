public class Variable02 {

    public static void main(String[] args) {
        // 定数の宣言 最初に代入した値を後から変更できない変数 定数名は、全て大文字で記述
        final int MIN_NUMBER = 10;
        System.out.println(MIN_NUMBER);

        // 再代入しようとするとエラー
        // MIN_NUMBER = 20;
    }
}