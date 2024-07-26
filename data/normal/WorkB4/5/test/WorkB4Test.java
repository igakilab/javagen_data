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
        input = "apple\nbanana\ncherry\nend\nbanana\nbanana\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "ArrayListに文字列を追加します。終了する場合は'end'と入力してください。\n文字列を入力: 文字列を入力: 文字列を入力: 文字列を入力: ArrayListのサイズは: 3\n検索する文字列を入力してください: banana はArrayListに含まれています。\nArrayListの全要素を表示します:\n要素 0: apple\n要素 1: banana\n要素 2: cherry\n削除する文字列を入力してください: banana をArrayListから削除しました。\n現在のArrayListの要素:\n要素 0: apple\n要素 1: cherry";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }

    @Test
    public void mainTest2() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "dog\ncat\nbird\nend\nfish\ncat\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "ArrayListに文字列を追加します。終了する場合は'end'と入力してください。\n文字列を入力: 文字列を入力: 文字列を入力: 文字列を入力: ArrayListのサイズは: 3\n検索する文字列を入力してください: fish はArrayListに含まれていません。\nArrayListの全要素を表示します:\n要素 0: dog\n要素 1: cat\n要素 2: bird\n削除する文字列を入力してください: cat をArrayListから削除しました。\n現在のArrayListの要素:\n要素 0: dog\n要素 1: bird";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
