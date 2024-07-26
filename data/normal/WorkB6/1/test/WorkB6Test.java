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
        input = "山田太郎\n25\n鈴木花子\n30\n終了\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "ユーザー名を入力してください(終了するには'終了'と入力):\n年齢を入力してください:\nユーザー名を入力してください(終了するには'終了'と入力):\n年齢を入力してください:\nユーザー名を入力してください(終了するには'終了'と入力):\n---- 登録されたユーザー情報 ----\nユーザー名: 山田太郎, 年齢: 25\nユーザー名: 鈴木花子, 年齢: 30\n登録ユーザー数: 2";
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
        input = "田中一郎\n40\n終了\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "ユーザー名を入力してください(終了するには'終了'と入力):\n年齢を入力してください:\nユーザー名を入力してください(終了するには'終了'と入力):\n---- 登録されたユーザー情報 ----\nユーザー名: 田中一郎, 年齢: 40\n登録ユーザー数: 1";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
