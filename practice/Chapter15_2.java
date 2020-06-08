package practice;

// １行ずつ読み込み、書き出しが出来る。
import java.io.BufferedReader;
import java.io.BufferedWriter;
// java.io.IOExceptionは入出力処理中の例外を管理するクラスです。
import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;

public class Chapter15_2 {
    public static void main(String[] args) {
        FileSystem fs = FileSystems.getDefault();
        // PathクラスのインスタンスをFileSystem.getPathメソッドで生成
        Path inputPath = fs.getPath("resouces/input.txt");
        Path outputPath = fs.getPath("resouces/output.txt");

        // Java7以降に追加された「try-with-resources」文で処理
        // Filesクラスを使用して、BufferedReaderクラスのインスタンスを生成
        // Files reader = new BufferReader();
        // Filesクラスを使用して、BufferedWriterクラスのインスタンスを生成
        // Files writer = new BufferWriter();
        try (BufferedReader reader = Files.newBufferedReader(inputPath);
                BufferedWriter writer = Files.newBufferedWriter(outputPath);) {

            // 変数 line の値が定義されているか(nullでないかどうか)を判定する
            String line = null;
            // BufferedReader.readLineメソッドを使用して、1行づつ処理
            reader.readLine();
            // 読み込む行がなくなるまでループ
            while ( (line = reader.readLine()) != null ) {
                // 文字数が5以外の場合はスキップ
                if (line.length() != 5) {
                  continue;
                }
                // 読み込んだ1行を出力
                writer.write(line);
                // 改行がついてないので改行を出力
                writer.newLine();
            }

        // 例外処理を記述
        // printStackTraceで例外を出力
        } catch (IOException e)  {
            e.printStackTrace();
        } finally {
            System.out.println("出力処理終了");
        }
    }
}