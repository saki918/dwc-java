package practice;

public class Soldier implements Character {
    // プログラムを作成
    // インターフェースのメソッドを「Soldier」用にオーバーライドします。
    public int attack() {
      System.out.println("戦士の会心の一撃！");
      return 100;
  }
}