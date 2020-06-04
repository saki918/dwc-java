package practice;

public class Car {
    // 燃費（Km/L）
    private double fuelCost;
    // 残量（L）
    private double fuelAmount;

    // コンストラクタを作成
    public Car(double fuelCost, double fuelAmount) {
      // 燃費（Km/L）
      this.fuelCost = fuelCost;
      // 残量（L）
      this.fuelAmount = fuelAmount;
    }

    // moveメソッド
    // ・"xx km 走ります"を出力
    // ・残量を計算
    public void move(int run) {
      System.out.println( run + "km走ります");
      this.fuelAmount -= ( run / fuelCost );
    }

    // fuelAmountを取得するメソッドを作成
    public double getFuelAmount() {
      return this.fuelAmount;
    }
}