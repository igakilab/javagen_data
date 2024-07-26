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
        input = "今日はいい天気です。\n明日はもっといい天気だそうです。\nend\n天気\n気候\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "複数の文章を入力してください。終了したい場合は 'end' と入力してください。\n検索キーワードを入力してください: 置換キーワードを入力してください: 置換後の文章は次の通りです:\n今日はいい気候です。\n明日はもっといい気候だそうです。";
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
        input = "私は犬が好きです。\n犬は本当に可愛い動物です。\nend\n犬\n猫\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "複数の文章を入力してください。終了したい場合は 'end' と入力してください。\n検索キーワードを入力してください: 置換キーワードを入力してください: 置換後の文章は次の通りです:\n私は猫が好きです。\n猫は本当に可愛い動物です。";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
