import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class index2 {
    public static void main(String[] args) {
        String inputFileName = "index.java";  // 読み込むファイル（プログラムファイル）
        String outputFileName = "output.java"; // 書き出すファイル

        try {
            // ファイルを読み込み
            BufferedReader reader = new BufferedReader(new FileReader(inputFileName));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFileName));

            String line;
            while ((line = reader.readLine()) != null) {
                String processedLine = processLine(line); // 各行を処理（ここでは反転）
                writer.write(processedLine);
                writer.newLine(); // 改行を追加
            }

            // リソースを閉じる
            reader.close();
            writer.close();

            System.out.println("index2.java の処理が完了し、output.java に書き出しました。");
        } catch (IOException e) {
            System.out.println("ファイル操作中にエラーが発生しました: " + e.getMessage());
        }
    }

    // 行を処理するメソッド（ここでは反転）
    public static String processLine(String str) {
        StringBuilder sb = new StringBuilder(str);
        return sb.reverse().toString(); // 文字列を逆順にする
    }
}
