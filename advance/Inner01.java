package advance;

// import advance.Outer.Inner;

public class Inner01 {
  // 内部クラスとは、クラスの中にあるクラスのことです。
  // クラスAの中に、内部クラスBを持つ例が以下のコードです。
  public class A {
    public class B {
        // 内部クラスBの中に、さらに内部クラスCを持つ例が以下のコードです。
        public class C {
        }
    }
  }
  // 内部クラスではなくても、1ファイルに複数のクラスを持つこともできます。
  // この場合は内部クラスではありません。
  public class D {
  }

  class E {
  }
  // staticクラスは、クラス外から直接インスタンス化できる
  // 非staticクラスは、外部クラスのインスタンスからのみインスタンス化できる
  public class Outer {
    public class Inner {
    }
  }
  // public static void main(String[] args) {
  //   Outer outer = new Outer(); // クラスOuterをインスタンス化
  //   Outer.Inner inner = outer.new Inner(); // クラスOuterの内部クラスInnerをインスタンス化
  // }
}