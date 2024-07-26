import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB5Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "2\n2023/10/01\n今日は良い天気です\n2023/10/02\n明日は雨の予報です\n天気\n天候\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "エントリ数を入力してください: 日付 (1): 内容 (1): 日付 (2): 内容 (2): 検索対象のキーワードを入力してください: 置換する文字列を入力してください: 置換結果:\n日付: 2023/10/01\n内容: 今日は良い天候です\n置換後のエントリに置換された文字列が含まれています。\n----------\n日付: 2023/10/02\n内容: 明日は雨の予報です\n置換後のエントリに置換された文字列が含まれていません。\n----------\nキーワードのリストアップ:\n日付: 2023/10/01\n内容: 今日は良い天気です";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
