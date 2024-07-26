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
        input = "Tokyo\nOsaka\nNagoya\nend\nOsaka\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "都市の名前を複数入力してください。(終了するには 'end' を入力)\nリストから確認したい都市の名前を入力してください:\nOsaka はリストに含まれています。削除します。\n現在の都市リスト:\nTokyo\nNagoya";
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
        input = "Kyoto\nKobe\nend\nTokyo\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "都市の名前を複数入力してください。(終了するには 'end' を入力)\nリストから確認したい都市の名前を入力してください:\nTokyo はリストに含まれていません。\n現在の都市リスト:\nKyoto\nKobe";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
