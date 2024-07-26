import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB2Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "Charlie\nDavid\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB2.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "配列に追加する名前を入力してください:\n配列のインデックス1の名前: Bob\n配列の全ての名前:\nAlice\nBob\nCharlie\nArrayListに追加する名前を入力してください:\nArrayListのインデックス1の名前: Bob\nArrayListの全ての名前:\nAlice\nBob\nDavid";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
