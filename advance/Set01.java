package advance;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Set01 {
  // Set
  /* Setとは、重複のない要素を管理するコレクションです。Setは、重複した要素を保持することができず、要素の順番も保証されません。
  Setもインターフェースのため、HashSetやLinkedHashSetなどのSetを実装したクラスを使用する必要があります。 */

  public static void main(String[] args) {
    // Setの生成

    // HashSetを生成する場合
    Set<String> set1 = new HashSet<String>();

    // LinkedHashSetを生成する場合
    Set<Integer> set2 = new LinkedHashSet<Integer>();

    // Setの操作

    // 要素の追加
    // 要素を追加するにはaddメソッドを使います。
    // 要素を追加する
    set1.add("スイカ");
    set1.add("メロン");

    // 要素の取得
    // Setには位置(インデックス)やキーなどの要素を特定する考え方がなく、あくまで集合に過ぎません。
    // そのため、要素を取り出したいときは繰り返し処理を用います。

    // 要素の存在チェック
    // ある要素がSetに含まれるか確認するには contains メソッドを使います。戻り値はbooleanです。
    // 存在チェック (trueを返す)
    System.out.println(set1.contains("スイカ"));

    // 存在チェック (falseを返す)
    System.out.println(set1.contains("なし"));

    /* 要素数の取得
       コレクションの要素数の合計を取得するには、 size メソッドを使います。 */
    System.out.println(set1.size()); // 2を返す

    /* 要素の削除
       要素を削除するにはremoveメソッドを使います。存在しない要素を指定すると、何もせず、エラーも発生しません。 */
    // 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます) メロンの要素のみ残ります。
    set1.remove("スイカ");
    set1.remove("なし"); // 何もしない

  }
}