package practice;

import extend.phone.Phone;

public class FlyingPhone implements Phone, Flying {
    // プログラムを作成
    private int time;

    // コンストラクタ
    public FlyingPhone(int time) {
      this.time = time;
    }

    // 抽象メソッドのオーバーライド
    public void fly() {
      System.out.println( this.time + "分間、飛びます。");
    }

    public void call(String number) {
      System.out.println( number + "に電話します。通話できるのは飛んでいる間だけです。");
    }

    // defaultメソッドのオーバーライドしないとコンパイルエラー
    public void powerOff() {
      // Flyingのdefaultメソッドを呼び出す。(Phone.Flyingの両方あるので。どちらかを指定)
      Flying.super.powerOff();
    }
}