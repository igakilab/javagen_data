import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class Work65Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "10\n5\n8\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Work65.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "1つ目の数値を入力してください:\n2つ目の数値を入力してください:\n3つ目の数値を入力してください:\n最大値: 10\n最小値: 5";
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
        input = "3\n3\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        Work65.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "1つ目の数値を入力してください:\n2つ目の数値を入力してください:\n3つ目の数値を入力してください:\n最大値: 3\n最小値: 3";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
