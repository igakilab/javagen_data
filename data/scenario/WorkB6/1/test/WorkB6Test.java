import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB6Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "Alice\n20\nBob\n22\nexit\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "学生の名前を入力してください（終了するには 'exit' と入力）：\n学生の年齢を入力してください：\n学生の名前を入力してください（終了するには 'exit' と入力）：\n学生の年齢を入力してください：\n学生の名前を入力してください（終了するには 'exit' と入力）：\n登録された学生の名前は以下の通りです：\nAlice\nBob\n登録された学生の数：2";
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
        input = "Charlie\n25\nexit\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "学生の名前を入力してください（終了するには 'exit' と入力）：\n学生の年齢を入力してください：\n学生の名前を入力してください（終了するには 'exit' と入力）：\n登録された学生の名前は以下の通りです：\nCharlie\n登録された学生の数：1";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
