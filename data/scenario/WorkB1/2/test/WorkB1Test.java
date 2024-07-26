import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB1Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "Hello\nWorld\nJava\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB1.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "1番目の文字列を入力してください:\n2番目の文字列を入力してください:\n3番目の文字列を入力してください:\n入力された文字列は以下の通りです:\nHello\nWorld\nJava";
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
        input = "Apple\nBanana\nCherry\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB1.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "1番目の文字列を入力してください:\n2番目の文字列を入力してください:\n3番目の文字列を入力してください:\n入力された文字列は以下の通りです:\nApple\nBanana\nCherry";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
