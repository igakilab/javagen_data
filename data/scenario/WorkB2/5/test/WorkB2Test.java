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
        input = "Tablet\n650.99\nMouse\n50.75\nTablet\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB2.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "新しい商品を追加してください。\n商品名: 価格: 商品名: 価格: 価格を知りたい商品の名前を入力してください: 商品 'Tablet' の価格は 650.99 円です。\n\nカートの内容:\nLaptop: 1200.50 円\nSmartphone: 800.75 円\nHeadphones: 150.25 円\nKeyboard: 100.00 円\nTablet: 650.99 円\nMouse: 50.75 円\n\n合計金額: 2953.24 円\n\n最も高価な商品: Laptop (1200.50 円)\n最も低価な商品: Mouse (50.75 円)";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
