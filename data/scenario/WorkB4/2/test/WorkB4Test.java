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
        input = "10\n20\n30\n40\n50\n30\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "5つの整数を入力してください。\n削除したい整数を入力してください。\n30はリストから削除されました。\n現在のリストの状態:\n10\n20\n40\n50";
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
        input = "5\n10\n15\n20\n25\n100\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "5つの整数を入力してください。\n削除したい整数を入力してください。\n100はリストに存在しません。\n現在のリストの状態:\n5\n10\n15\n20\n25";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
