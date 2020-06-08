package practice;

public class Chapter15_3 {
    public static void main(String[] args) {
            // キャスト (小数点側が整数側に合わせる。)
            // データサイズが小さい型から大きい型は暗黙的にキャストされるため、明示的にキャストする必要がありません。
            // 上に記述されているデータサイズが大きければ、下に型変換を記述する必要がある。

            // 整数型から小数点での表現は問題ないので、キャストの必要なし。
            int i1 = 123;
            double d1 = i1;
            System.out.println(d1);

            // 小数点から、整数への変換では全てを表現できないので、キャストして
            // doubleからintへ型変換させる。
            double d2 = 12.345;
            int i2 = (int)d2;
            System.out.println(i2);

            // 整数の計算結果を小数点で表示させたいので、計算式の前にキャストを記述して、表示。
            int i3 = 1;
            int i4 = 2;
            // 計算結果を小数点で表す、double型に合わせて表示。
            double d3 = (double)i3 / i4;
            System.out.println(d3);

            // 大きい型から小さい型への変換なので、記述は必要。
            // byte型の上限値(127)より大きい値を代入しているため、元の値と違う値となってしまいます。このようにデータサイズの上限値を超えてしまうことを「桁あふれ（オーバーフロー）」と言います。
            int i5 = 128;
            byte b1 = (byte)i5;
            System.out.println(b1);
    }
}
/* 型名    型分類   サイズ    初期値      表示可能な値
   long	    整数	    64	      0L	      -9223372036854775808 ～ 9223372036854775807
   int	    整数	    32	      0	        -2147483648 ～ 2147483647
   short	  整数	    16	      0	        -32768 ～ 32767
   byte	    整数   	   8	      0	        -128 ～ 127
   double	浮動小数	  64	      0.0d	    倍精度浮動小数点数
   float	浮動小数	  32	      0.0f	    単精度浮動小数点数 */