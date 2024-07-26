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
        input = "Hello, world! This is a sample text.\nworld\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "テキストを入力してください:\n検索する文字列を入力してください:\n結果: world! This is a sample text.";
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
        input = "Hello, world! This is a sample text.\njava\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "テキストを入力してください:\n検索する文字列を入力してください:\nエラー: テキストに指定された文字列が含まれていません。";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
