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
        input = "今日は晴れです。雨が降りませんように。\n晴れ\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "テキストを入力してください:\n検索したい単語を入力してください:\nテキストに含まれている単語を見つけました。\n置換後のテキスト:\n今日は晴れです。雨が降りませんように。";
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
        input = "プログラミングが楽しいです。\n宿題\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "テキストを入力してください:\n検索したい単語を入力してください:\nテキストに単語は含まれていません。";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
