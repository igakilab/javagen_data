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
        input = "2\n田中太郎\n20\n鈴木花子\n21\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB1.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "学生の人数を入力してください: 学生1の名前を入力してください: 学生1の年齢を入力してください: 学生2の名前を入力してください: 学生2の年齢を入力してください: すべての学生の情報:\n学生1 - 名前: 田中太郎, 年齢: 20\n学生2 - 名前: 鈴木花子, 年齢: 21";
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
        input = "3\n山田太郎\n22\n佐藤次郎\n23\n伊藤一郎\n24\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB1.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "学生の人数を入力してください: 学生1の名前を入力してください: 学生1の年齢を入力してください: 学生2の名前を入力してください: 学生2の年齢を入力してください: 学生3の名前を入力してください: 学生3の年齢を入力してください: すべての学生の情報:\n学生1 - 名前: 山田太郎, 年齢: 22\n学生2 - 名前: 佐藤次郎, 年齢: 23\n学生3 - 名前: 伊藤一郎, 年齢: 24";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
