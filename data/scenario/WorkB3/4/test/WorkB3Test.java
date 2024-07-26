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
        input = "1\nJava入門\n2\nJava入門\n2\nPython入門\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB3.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "図書館管理システム:\n1: 書籍を登録する\n2: 書籍が登録されているか調査する\n3: 終了する\n選択してください (1/2/3): 登録する書籍名を入力してください: 書籍が登録されました。\n図書館管理システム:\n1: 書籍を登録する\n2: 書籍が登録されているか調査する\n3: 終了する\n選択してください (1/2/3): 調査する書籍名を入力してください: その書籍は登録されています。\n図書館管理システム:\n1: 書籍を登録する\n2: 書籍が登録されているか調査する\n3: 終了する\n選択してください (1/2/3): 調査する書籍名を入力してください: その書籍は登録されていません。\n図書館管理システム:\n1: 書籍を登録する\n2: 書籍が登録されているか調査する\n3: 終了する\n選択してください (1/2/3): システムを終了します。";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
