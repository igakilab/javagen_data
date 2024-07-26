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
        input = "apple\nbanana\ncherry\ndate\nelderberry\nbanana\ncherry\n2\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "ArrayListに追加する5つの要素を入力してください:\n現在のArrayListの内容: [apple, banana, cherry, date, elderberry]\n調べたい要素を入力してください:\nbananaはArrayListに含まれています。\n削除したい要素を入力してください:\ncherryがArrayListから削除されました。\n変更後のArrayListの内容: [apple, banana, date, elderberry]\nインデックスを入力して要素を取得します:\nインデックス2の要素は: date";
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
        input = "dog\ncat\nbird\nfish\nturtle\nlion\nfish\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "ArrayListに追加する5つの要素を入力してください:\n現在のArrayListの内容: [dog, cat, bird, fish, turtle]\n調べたい要素を入力してください:\nlionはArrayListに含まれていません。\n削除したい要素を入力してください:\nfishがArrayListから削除されました。\n変更後のArrayListの内容: [dog, cat, bird, turtle]\nインデックスを入力して要素を取得します:\n無効なインデックスです。";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
