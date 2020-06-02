public class DoWhile01 {
    public static void main(String[] args) {
        int number = 200;
        // まず、ブロックの処理を実行し、処理が完了した後に条件式を評価します。そのため、仮にはじめから条件式の結果が「false」となっていても、while文とは異なり、最低1度はブロックの処理が実行されます。
        do {
            number *= 2;
            System.out.println("DoWhile01 = " + number);
        } while (number < 50);
    }
}