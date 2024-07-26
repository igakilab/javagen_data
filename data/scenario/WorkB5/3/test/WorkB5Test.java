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
        input = "3\n今日は晴れです。\n明日は雨かもしれません。\nお天気の話題が多いです。\n雨\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "いくつの文章を入力しますか？\n文章を入力してください:\n文章を入力してください:\n文章を入力してください:\n検索キーワードを入力してください:\nキーワードを含む文章:\n明日は雨かもしれません。\n入力された文章（大文字変換）:\n今日は晴れです。\n明日は雨かもしれません。\nお天気の話題が多いです。";
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
        input = "2\nコーヒーが好きです。\n紅茶よりコーヒー派。\nコーヒー\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "いくつの文章を入力しますか？\n文章を入力してください:\n文章を入力してください:\n検索キーワードを入力してください:\nキーワードを含む文章:\nコーヒーが好きです。\n紅茶よりコーヒー派。\n入力された文章（大文字変換）:\nコーヒーが好きです。\n紅茶よりコーヒー派。";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
