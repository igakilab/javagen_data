import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB4Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "1\napple\n1\nbanana\n3\n4\napple\n2\napple\n5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "メニュー:\n1. 要素を追加\n2. 要素を削除\n3. 要素を表示\n4. 特定の要素が含まれているか調べる\n5. 終了\n選択してください: 追加したい要素を入力: apple を追加しました。\nメニュー:\n1. 要素を追加\n2. 要素を削除\n3. 要素を表示\n4. 特定の要素が含まれているか調べる\n5. 終了\n選択してください: 追加したい要素を入力: banana を追加しました。\nメニュー:\n1. 要素を追加\n2. 要素を削除\n3. 要素を表示\n4. 特定の要素が含まれているか調べる\n5. 終了\n選択してください: 現在の要素一覧:\n0: apple\n1: banana\nメニュー:\n1. 要素を追加\n2. 要素を削除\n3. 要素を表示\n4. 特定の要素が含まれているか調べる\n5. 終了\n選択してください: 調べたい要素を入力: apple はリストに含まれています。\nメニュー:\n1. 要素を追加\n2. 要素を削除\n3. 要素を表示\n4. 特定の要素が含まれているか調べる\n5. 終了\n選択してください: 削除したい要素を入力: apple を削除しました。\nメニュー:\n1. 要素を追加\n2. 要素を削除\n3. 要素を表示\n4. 特定の要素が含まれているか調べる\n5. 終了\n選択してください: プログラムを終了します。";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
