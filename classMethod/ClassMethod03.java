package classMethod;

import classMethod.human.Human03;

public class ClassMethod03 {
    public static void main(String[] args) {
        Human03 yamada = new Human03();

        System.out.println("私の名前は、" + yamada.name + "です。");
        // 戻り値ありのgetProfileメソッドを呼び出して、戻り値を表示
        String profile = yamada.getProfile();
        System.out.println(profile + "です。");

        // 戻り値なしのgreetメソッドを呼び出し
        yamada.greet("田辺");
        yamada.greet(null);
    }
}

/* 呼び出す(実行)時は、カレントディレクトリから見たパスを指定する
   カレントディレクトリ javaにいる場合、java $ java classMethod/ClassMethod03
   カレントディレクトリ classMethodにいる場合、classMethod $ java -cp .. ClassMethod03.java (最後の.javaを忘れるとエラーになる。)
*/