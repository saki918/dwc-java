package advance;

// 外部クラス
public class Outer01 {
  // 外部クラスに定義したフィールドgreeting
  private String greeting = "こんにちは";
  // 以下 内部クラス
  // 非staticクラス
  public class Inner {
    public String hello() {
      // 内部クラスInnerから、外部クラスOuterのフィールドgreetingを参照
            return greeting;
        }
  }

  // 非staticなフィールドgreeting
  private String greeting1 = "こんにちは";
  // staticなフィールドgreeting
  private static String greeting2 = "こんにちは";
  // staticクラス
  public static class Inner1 {
    public String hello() {
      // 外部クラスOuterのフィールドgreeting1は非staticなので、コンパイルエラー
            return greeting2;
        }
  }
}