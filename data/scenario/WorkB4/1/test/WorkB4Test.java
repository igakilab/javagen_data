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
        input = "Alice\nBob\nCharlie\nBob\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "3つの名前を入力してください：\n1つ目の名前: 2つ目の名前: 3つ目の名前: 確認したい名前を入力してください：Bob はリストに含まれています。\nBob をリストから削除しました。\nリストの残りの要素：\nAlice\nCharlie";
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
        input = "Alice\nBob\nCharlie\nDavid\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "3つの名前を入力してください：\n1つ目の名前: 2つ目の名前: 3つ目の名前: 確認したい名前を入力してください：David はリストに含まれていません。\nリストの残りの要素：\nAlice\nBob\nCharlie";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
