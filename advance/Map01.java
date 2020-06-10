package advance;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map01 {
  // Map
  /* Mapとは、「キー」と「値」の組み合わせで要素を管理するコレクションです。Mapは、1つの「キー」に対して、1つの「値」が存在します。そのため、「キー」は重複して保持することができません。「値」は、重複して保持することができます。追加した要素の順番は保証されません。MapもList同様にインターフェースのため、HashMapやTreeMapなどのMapを実装したクラスを使用する必要があります。 */

  public static void main(String[] args) {

    // Mapの生成
    /* 実装したいクラスによって異なりますが、生成は次のように行います */

    // HashMapを生成する場合
    Map<Integer, String> map1 = new HashMap<Integer, String>();

    // TreeMapを生成する場合
    Map<String, String> map2 = new TreeMap<String, String>();

    // Mapの操作
    /* Listと同様、使えるメソッドの一部を紹介します。例として、HashMap map1 を捜査対象としていますが、どのクラスを実装していても使えるメソッドは同じです。 */

    // 要素の追加
    // 要素を追加するにはputメソッドを使います。既に追加済みのキーを用いると、あとから追加した値で上書きされます。
    // 要素を追加する
    map1.put(0, "ぶどう");
    map1.put(3, "もも");

    // 要素の取得
    System.out.println(map1.get(0));
    System.out.println(map1.get(3));

    // 登録済みのキーで追加すると上書きされる
    map1.put(0, "マスカット");

    System.out.println(map1.get(0)); // マスカットを返す
    // 存在しないキーを指定した場合は戻り値がnullとなるので注意
    System.out.println(map1.get(1)); // nullを返す

    // 要素の存在チェック
    // ある要素が含まれるか確認するにはcontainsKeyやcontainsValueを使います。名前の通り、それぞれキーと値のチェックができるメソッドで、戻り値はbooleanです。
    // キーの存在チェック (trueを返す)
    System.out.println(map1.containsKey(0));

    // 値の存在チェック (falseを返す)
    System.out.println(map1.containsValue("ぶどう"));

    // 要素数の取得
    // コレクションの要素数の合計を取得するには、 size メソッドを使います
    System.out.println(map1.size()); // 2を返す

    // 要素の削除
    // 要素を削除するにはremoveメソッドを使います。キーのみか、キーと値の両方の指定ができます。キーを指定するとそれで特定される要素が削除され、両方を指定した場合はキーも値もともに一致する要素が削除されます。いずれも、該当する要素が存在しなければ何もせず、エラーも発生しません。

    // キーを指定して要素を削除する
    map1.remove(0);
    map1.remove(1); // 何もしない

    // キーと値を指定して要素を削除する
    map1.remove(3, "もも");
    map1.remove(3, "なし"); // 何もしない

    System.out.println(map1.get(1)); // removeした後なので、出力結果はnullになる

    // 拡張for文
    /* キーのみ
       値のみ
       キーと値のペア のいずれかをループの対象とすることができます。 */
    Map<Integer, String> classmates = new HashMap<>();
    classmates.put(1, "青木");
    classmates.put(2, "石坂");
    classmates.put(3, "小野田");

    // キーのみ
    for (Integer key : classmates.keySet()) {
      System.out.println(key); // 1, 2, 3の順に表示
    }

    // 値のみ
    for (String name : classmates.values()) {
      System.out.println(name); // 青木、石坂、小野田の順に表示
    }

    // キーと値のペア
    for (Map.Entry<Integer, String> classmate : classmates.entrySet()) {
      System.out.println(classmate.getKey() + "番は" + classmate.getValue() + "さん"); // 1番は青木さん、2番は石坂さん、3番は小野田さんの順に表示
    }

  }
}