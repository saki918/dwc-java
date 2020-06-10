package advance;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List01 {
  // コレクションAPIとは
  /* コレクションAPIとは、オブジェクトの集合を管理、操作するためのJava標準のAPIです。このオブジェクトの集合を「コレクション」、コレクションの中身ひとつひとつを「要素」と言います。
  ここでは、コレクションAPIの中で、もっとも使用される３つのAPIについて説明します。それぞれ、要素の追加や削除、コレクションおよび中身の変換、そしてサイズやインデックスなどの取得といったメソッドが予め用意されています。 */

  // List
  /* Listとは、配列と同じようにインデックス番号の順序に要素（オブジェクト）を管理するコレクションです。Listは、重複した要素を保持することができます。配列との違いは、オブジェクト生成時に要素数の指定は必要がなく、要素を追加・削除するたびにサイズが増減することです。Listはインターフェースなので、使用する場合は、Listを実装しているクラスを使用する必要があります。Listを実装しているクラスには、ArrayListやLinkedListなどがあります。 */

  public static void main(String[] args) {

    // Listの生成

    // ArrayListを生成する場合
    List<String> list1 = new ArrayList<String>();

    // LinkedListを生成する場合
    List<Integer> list2 = new LinkedList<Integer>();

    // 要素の追加
    // 要素を追加するにはaddメソッドを使います。位置を指定できますが、指定しなかった場合は末尾に要素が追加されます。
    // 要素を追加する
    list1.add("りんご");
    list1.add("みかん");

    // 位置を指定して要素を追加する
    list1.add(1, "バナナ");
    // 上記はりんご、バナナ、みかんの順に要素を持ちます。

    // コレクションの要素数より大きい位置を指定すると実行時エラー
    // list1.add(5, "ドリアン");

    // 要素を取得する
    System.out.println(list1.get(0));

    // 存在チェック (trueを返す) 戻り値はboolean
    System.out.println(list1.contains("バナナ"));

    // 存在チェック (falseを返す)
    System.out.println(list1.contains("なし"));

    // 要素数の取得
    System.out.println(list1.size()); // 3を返す

    // 要素を削除する (要素が文字列の場合、文字列として同じであれば削除されます)
    list1.remove("バナナ");
    list1.remove("なし"); // 何もしない

    // 位置を指定して要素を削除する
    list1.remove(0);
    // list1.remove(5); // コレクションの要素数より大きい位置を指定すると実行時エラー

    // ArrayListとLinkedList
    /* Listインターフェースを実装したクラスは色々ありますが、よく使われるArrayListとLinkedListをとっても、それぞれ特徴があります。 */

    /* インデックス指定で要素を取り出すのはArrayListの方が速い
       先頭から順に処理をするのはArrayListの方が速い
       要素の挿入はLinkedListの方が速い
       要素の削除はLinkedListの方が速い などです。状況に応じ使い分けることが大事です。 */

    // 拡張for文
    // Listの例
    List<String> prefectures = new ArrayList<>();
    prefectures.add("北海道");
    prefectures.add("青森県");
    prefectures.add("秋田県");

    for (String prefecture : prefectures) {
      System.out.println(prefecture); // 北海道、青森県、秋田県の順に表示
    }
  }
}