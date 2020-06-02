public class Chapter07 {
  public static void main (String[] args) {
    int lunchMoney = 800;
    // if (lunchMoney >= 800 ) {
    //   System.out.println("チャーシューメンが食べられます");
    // } else if (600 < lunchMoney) {
    //   System.out.println("ラーメンが食べられます");
    // } else {
    //   System.out.println("どのラーメンも食べられません");
    // }
    switch (lunchMoney) {
      // caseには、定数のみ設定できる。
      case 800:
        System.out.println("チャーシューメンが食べられます");
        break;
      case 600:
        System.out.println("ラーメンが食べられます");
        break;
      default:
        System.out.println("どのラーメンも食べられません");
    }
  }
}