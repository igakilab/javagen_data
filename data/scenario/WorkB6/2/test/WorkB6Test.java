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
        input = "Javaの入門書\n山田太郎\nPythonの教科書\n鈴木一郎\nexit\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "本のタイトルを入力してください (終了するには 'exit' と入力):\n本の著者を入力してください:\n本のタイトルを入力してください (終了するには 'exit' と入力):\n本の著者を入力してください:\n本のタイトルを入力してください (終了するには 'exit' と入力):\n追加された全ての本のタイトル:\nJavaの入門書\nPythonの教科書";
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
        input = "データ構造とアルゴリズム\n佐藤花子\nexit\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "本のタイトルを入力してください (終了するには 'exit' と入力):\n本の著者を入力してください:\n本のタイトルを入力してください (終了するには 'exit' と入力):\n追加された全ての本のタイトル:\nデータ構造とアルゴリズム";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
