import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB3Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "15\n30\n50\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB3.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "番号を入力してください: 番号を入力してください: 番号を入力してください: 番号 15 はリストに含まれていません。\n番号 30 はリストに含まれています。\n番号 50 はリストに含まれています。";
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
        input = "10\n34\n22\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB3.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "番号を入力してください: 番号を入力してください: 番号を入力してください: 番号 10 はリストに含まれています。\n番号 34 はリストに含まれていません。\n番号 22 はリストに含まれていません。";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
