package advance;

public class Enum01 {
  // 列挙型を使わず定数で定義
  public static final String APPLE = "りんご";
  public static final String ICE_CREAM = "アイスクリーム";
  public static final String CAKE = "ケーキ";

  // classの代わりに、enum と記述
  // 最後のカンマは付けなくてもOK！
  public enum Dessert {
    // それぞれに値(値段)を指定する(ooo)
    // APPLE(100),ICE_CREAM(200),CAKE(300),APPLE1(400)

    // メソッドを追加できる
    // インスタンスごとにメソッドを追加することもできます。抽象メソッドを用意し、各インスタンスでそれを継承すると、インスタンスごとに実行したいコードの内容を変えることができて便利です。
    APPLE(100) {
      @Override
      void advertise() {
        // りんご用のadvertiseの実装
        System.out.println("まっかなりんごが" + getPrice() + "円！"); // getPriceメソッドも活用できる
      }
    },
    
    ICE_CREAM(200) {
      @Override
      void advertise() {
        // アイスクリーム用のadvertiseの実装
        System.out.println("夏にぴったりアイスクリームが" + getPrice() + "円！");
      }
    },
    
    CAKE(300) {
      @Override
      void advertise() {
        // ケーキ用のadvertiseの実装
        System.out.println("皆大好き甘いケーキが" + getPrice() + "円！");
      }
    },

    APPLE1(400) {
      @Override
      void advertise() {
        // APPLE1用のadvertiseの実装
        System.out.println("皆大好き甘いりんごが" + getPrice() + "円！");
      }
    },
    ;

    // 値段を保持するフィールド
    private int price;

    // コンストラクタを追加。引数はint型の値段。列挙型のコンストラクタはprivate
    private Dessert(int price) {
      this.price = price;
    }

    // 値段を取得するメソッドを追加
    public int getPrice() {
      return price;
    }

    // 宣伝文句を出力する抽象メソッド。各インスタンスで実装する。abstractは抽象メソッドに記述
    abstract void advertise();

  }

  // 列挙型の特徴②
  // 引数の型に用いることができる
  static void printDessertName(Dessert dessert){
    System.out.println(dessert);
  }
  public static void main(String[] args) {

    // 列挙型の特徴③
    // 新しいインスタンスを生成できない
    // Dessert orange = new Dessert();

    // 定数の場合
    System.out.println(APPLE);
    System.out.println(ICE_CREAM);
    System.out.println(CAKE);

    // Enumの場合
    System.out.println(Dessert.APPLE);
    System.out.println(Dessert.ICE_CREAM);
    System.out.println(Dessert.CAKE);

    // 列挙型の特徴①
    // 変数として使える
    Dessert apple = Dessert.APPLE;
    Dessert iceCream = Dessert.ICE_CREAM;
    Dessert cake = Dessert.CAKE;
    // 変数を定義して呼び出す場合
    System.out.println(apple);
    System.out.println(iceCream);
    System.out.println(cake);

    // メソッドでの呼び出し
    printDessertName(Dessert.APPLE);
    printDessertName(apple);

    // 列挙型の特徴④
    // ==で比較できる
    // 列挙型はコンパイル時に列挙した定数がそれぞれDessert型のstatic finalの定数として宣言されます。
    Dessert x = Dessert.APPLE;
    Dessert y = Dessert.APPLE;
    System.out.println(x == y); // trueを返す
    System.out.println(x.equals(y));    // trueを返す

    // 列挙型の機能
    // 列挙型には様々なメソッドが用意されています。
    // これが、定数をString型などで定義するより、列挙型を使うメリットといえます。
    // name() メソッド
    // 列挙した定数名そのものをString型で返します。
    System.out.println(Dessert.APPLE.name());

    // valueOf(String name)
    // name()とは逆に、String型の名称から列挙型のインスタンスを取得したい場合は、valueOf()を使います。
    Dessert apple1 = Dessert.valueOf("APPLE1");
    System.out.println(apple1);

    // ordinal()
    // 列挙した順序をint型で返します。（0スタートです）
    System.out.println(Dessert.APPLE.ordinal());
    System.out.println(Dessert.ICE_CREAM.ordinal());
    System.out.println(Dessert.CAKE.ordinal());
    System.out.println(Dessert.APPLE1.ordinal());

    // それぞれのデザートから値段が取得
    System.out.println(Dessert.APPLE.getPrice());
    System.out.println(Dessert.ICE_CREAM.getPrice());
    System.out.println(Dessert.CAKE.getPrice());
    System.out.println(Dessert.APPLE1.getPrice());

    // 抽象メソッドの呼び出し。
    Dessert.APPLE.advertise(); // 「まっかなりんごが100円！」と出力
    Dessert.ICE_CREAM.advertise(); // 「夏にぴったりアイスクリームが200円！」と出力
    Dessert.CAKE.advertise(); // 「皆大好き甘いケーキが300円！」と出力
    Dessert.APPLE1.advertise(); // 「皆大好き甘いりんごが400円！」と出力
  }
}