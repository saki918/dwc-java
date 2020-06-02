public class For02 {
    // 拡張for文とは、配列やコレクションの全要素に対して、繰り返し処理を行なう制御文です。
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        for (int number : array) {
            System.out.println("For02 = " + number);
        }
    }
}