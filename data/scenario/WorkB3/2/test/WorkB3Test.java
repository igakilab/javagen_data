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
        input = "リンゴ\nバナナ\nミルク\n終了\nバナナ\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB3.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "買い物リストに追加したいアイテムを入力してください。（終了するには'終了'と入力してください）\nリストの中にあるか調査したいアイテムを入力してください：バナナ は買い物リストに含まれています。";
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
        input = "トマト\nチーズ\n終了\nリンゴ\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB3.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "買い物リストに追加したいアイテムを入力してください。（終了するには'終了'と入力してください）\nリストの中にあるか調査したいアイテムを入力してください：リンゴ は買い物リストに含まれていません。";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
