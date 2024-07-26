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
        input = "1\n2\n3\n2\n1\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "5つの整数を入力してください。\nリストから削除したい整数を入力してください: 2はリストに含まれているので削除します。\nリストに残っている整数は以下の通りです:\n1\n3\n1";
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
        input = "10\n20\n30\n40\n50\n25\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "5つの整数を入力してください。\nリストから削除したい整数を入力してください: 25はリストに含まれていません。\nリストに残っている整数は以下の通りです:\n10\n20\n30\n40\n50";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
