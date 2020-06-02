public class Chapter06 {
  public static void main (String[] args) {
    int val = 2 + 5;
    System.out.println(val);
    System.out.println(++val);
    System.out.println(val *= 5);
    boolean bool = val == 50;
    System.out.println(bool);
    // 条件を2つ以上記述する場合は、1つ1つ（）で囲む。
    bool = (val < 50) && (val % 10 == 0);
    System.out.println(bool);
  }
}