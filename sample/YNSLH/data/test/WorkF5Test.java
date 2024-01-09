import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkF5Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "Hello World!\nI love Java!\nProgramming is fun!\nJava is awesome!\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkF5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "テキスト１を入力してください：\nテキスト２を入力してください：\nテキスト３を入力してください：\nテキスト４を入力してください：\nテキスト１：Hello World!\nテキスト２：I love Java!\nテキスト３：Programming is fun!\nテキスト４：Java is awesome!";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
