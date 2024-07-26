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
        input = "3\nJavaプログラミング入門\n3000\nPythonデータサイエンス\n4500\n機械学習の基礎\n4000\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB1.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "本の数を入力してください:\n1番目の本のタイトルを入力してください:\n1番目の本の価格を入力してください:\n2番目の本のタイトルを入力してください:\n2番目の本の価格を入力してください:\n3番目の本のタイトルを入力してください:\n3番目の本の価格を入力してください:\n最も高価な本のタイトルは: Pythonデータサイエンス";
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
        input = "2\nC++プログラミング\n3200\nアルゴリズム入門\n2800\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB1.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "本の数を入力してください:\n1番目の本のタイトルを入力してください:\n1番目の本の価格を入力してください:\n2番目の本のタイトルを入力してください:\n2番目の本の価格を入力してください:\n最も高価な本のタイトルは: C++プログラミング";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
