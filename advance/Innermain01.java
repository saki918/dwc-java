package advance;

// import advance.Outer01;

public class Innermain01 {
  public static void main(String[] args) {
    Outer01 outer = new Outer01(); // クラスOuterをインスタンス化

    // 非staticクラスは、外部クラスのインスタンスからのみインスタンス化できる
    Outer01.Inner inner = outer.new Inner(); // クラスOuterの内部クラスInnerをインスタンス化

    // staticクラスは、クラス外から直接インスタンス化できる
    Outer01.Inner1 inner1 = new Outer01.Inner1(); // クラスOuterの内部クラスInnerをインスタンス化
  }
}