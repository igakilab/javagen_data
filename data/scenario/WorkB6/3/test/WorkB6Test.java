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
        input = "Christopher Nolan\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "検索したい監督名を入力してください:\n\"Christopher Nolan\"監督の映画:\nタイトル: Inception, 監督: Christopher Nolan, 上映時間: 148分\nタイトル: Interstellar, 監督: Christopher Nolan, 上映時間: 169分\nタイトル: The Dark Knight, 監督: Christopher Nolan, 上映時間: 152分";
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
        input = "Quentin Tarantino\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "検索したい監督名を入力してください:\n\"Quentin Tarantino\"監督の映画:\nタイトル: Pulp Fiction, 監督: Quentin Tarantino, 上映時間: 154分\nタイトル: Kill Bill, 監督: Quentin Tarantino, 上映時間: 111分";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
