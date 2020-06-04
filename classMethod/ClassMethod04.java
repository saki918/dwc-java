package classMethod;

import classMethod.human.Human04;

public class ClassMethod04 {
    public static void main(String[] args) {
        Human04 yamada = new Human04("山田");
        Human04 sato = new Human04("佐藤");

        // 静的メンバは、インスタンス生成せずに直接使用できる
        Human04.staticMethodPrint();
        System.out.println(Human04.humanCount);

        // staticなクラス定数もインスタンスを生成せずに参照できる
        System.out.println(Human04.GREETING);

        // インスタンスメンバは直接使用できない（コンパイルエラーになる）
        // Human04.instanceMethodPrint();
        // System.out.println(Human04.name);

        // インスタンスメンバはインスタンス生成してから使用する
        yamada.instanceMethodPrint();
        System.out.println(yamada.name);
    }
}