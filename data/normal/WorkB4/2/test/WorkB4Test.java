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
        input = "apple\nbanana\ncherry\ndate\nelderberry\nfig\ngrape\nhoneydew\nita\njackfruit\nbanana\ndate\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "ArrayListに追加する文字列を10個入力してください：\n1番目の文字列: 2番目の文字列: 3番目の文字列: 4番目の文字列: 5番目の文字列: 6番目の文字列: 7番目の文字列: 8番目の文字列: 9番目の文字列: 10番目の文字列: 調べたい文字列を入力してください：\nArrayListには \"banana\" が含まれています。\n削除したい文字列を入力してください：\n\"date\" を削除しました。\nArrayListの全要素：\n1: apple\n2: banana\n3: cherry\n4: elderberry\n5: fig\n6: grape\n7: honeydew\n8: ita\n9: jackfruit";
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
        input = "dog\ncat\nbird\nfish\nhamster\nrabbit\nsnake\nspider\nfrog\nturtle\nwolf\nfish\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB4.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "ArrayListに追加する文字列を10個入力してください：\n1番目の文字列: 2番目の文字列: 3番目の文字列: 4番目の文字列: 5番目の文字列: 6番目の文字列: 7番目の文字列: 8番目の文字列: 9番目の文字列: 10番目の文字列: 調べたい文字列を入力してください：\nArrayListには \"wolf\" が含まれていません。\n削除したい文字列を入力してください：\n\"fish\" を削除しました。\nArrayListの全要素：\n1: dog\n2: cat\n3: bird\n4: hamster\n5: rabbit\n6: snake\n7: spider\n8: frog\n9: turtle";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
