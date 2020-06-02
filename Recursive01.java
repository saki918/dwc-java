public class Recursive01 {
  // While01.javaを再帰処理で書き直したもの
  public static void main(String[] args) {
    int number = 1;
    printNum(number);
  }

  public static int printNum(int number) {
    if (number < 50) {
      number *= 2;
      System.out.println("While01 = " + number);
      // 条件にマッチしたら自分自身を再度呼び出す
      printNum(number);
    }
    return number;
  }
}