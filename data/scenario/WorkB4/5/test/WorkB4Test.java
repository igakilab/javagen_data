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
        input = "りんご\n100\nskip\nバナナ\n150\nりんご\nexit\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "商品名を入力してください (終了する場合は 'exit' と入力):\n商品の価格を入力してください:\n削除したい商品名を入力してください (削除しない場合は 'skip' と入力):\n現在のリスト:\nりんご: 100円\n商品名を入力してください (終了する場合は 'exit' と入力):\n商品の価格を入力してください:\n削除したい商品名を入力してください (削除しない場合は 'skip' と入力):\nりんごをリストから削除しました。\n現在のリスト:\nバナナ: 150円\n商品名を入力してください (終了する場合は 'exit' と入力):";
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
        input = "オレンジ\n200\nskip\nexit\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "商品名を入力してください (終了する場合は 'exit' と入力):\n商品の価格を入力してください:\n削除したい商品名を入力してください (削除しない場合は 'skip' と入力):\n現在のリスト:\nオレンジ: 200円\n商品名を入力してください (終了する場合は 'exit' と入力):";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
