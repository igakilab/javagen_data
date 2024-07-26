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
        input = "Java programming is fun!\nfun\n2\nfun\nawesome\n1\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "文字列を入力してください：\n検索したい文字列を入力してください：\n検索方法を選んでください (1: indexOf, 2: contains)：\n文字列が見つかりました。\n置換したい文字列を入力してください：\n新しい文字列を入力してください：\n置換後の文字列：\nJava programming is awesome!\n文字列の大文字小文字を変換します。\n1: 大文字, 2: 小文字\nJAVA PROGRAMMING IS FUN!";
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
        input = "Hello world\nworld\n1\nworld\neveryone\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "文字列を入力してください：\n検索したい文字列を入力してください：\n検索方法を選んでください (1: indexOf, 2: contains)：\n文字列が見つかりました。\n置換したい文字列を入力してください：\n新しい文字列を入力してください：\n置換後の文字列：\nHello everyone\n文字列の大文字小文字を変換します。\n1: 大文字, 2: 小文字\nhello world";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
