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
        input = "1\n2\n3\n4\n5\n10\n20\n30\n40\n50\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB2.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "配列に追加する整数を入力してください: 配列に追加する整数を入力してください: 配列に追加する整数を入力してください: 配列に追加する整数を入力してください: 配列に追加する整数を入力してください: 配列の要素を出力します:\narray[0] = 1\narray[1] = 2\narray[2] = 3\narray[3] = 4\narray[4] = 5\nArrayListに追加する整数を入力してください: ArrayListに追加する整数を入力してください: ArrayListに追加する整数を入力してください: ArrayListに追加する整数を入力してください: ArrayListに追加する整数を入力してください: ArrayListの要素を出力します:\narrayList.get(0) = 10\narrayList.get(1) = 20\narrayList.get(2) = 30\narrayList.get(3) = 40\narrayList.get(4) = 50";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
