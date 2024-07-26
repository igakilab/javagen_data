import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB1Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "3\nインセプション\nSF\n9.0\nアバター\nSF\n8.5\nララランド\nミュージカル\n8.0\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB1.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "映画の数を入力してください: 映画のタイトルを入力してください: 映画のジャンルを入力してください: 映画の評価を入力してください (0.0〜10.0): 映画のタイトルを入力してください: 映画のジャンルを入力してください: 映画の評価を入力してください (0.0〜10.0): 映画のタイトルを入力してください: 映画のジャンルを入力してください: 映画の評価を入力してください (0.0〜10.0): ジャンルごとの映画タイトルと平均評価:\nジャンル: SF\nタイトル: インセプション アバター | 平均評価: 8.75\nジャンル: ミュージカル\nタイトル: ララランド | 平均評価: 8.00";
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
        input = "2\nターミネーター\nアクション\n8.0\n燃えよドラゴン\nアクション\n7.5\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB1.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "映画の数を入力してください: 映画のタイトルを入力してください: 映画のジャンルを入力してください: 映画の評価を入力してください (0.0〜10.0): 映画のタイトルを入力してください: 映画のジャンルを入力してください: 映画の評価を入力してください (0.0〜10.0): ジャンルごとの映画タイトルと平均評価:\nジャンル: アクション\nタイトル: ターミネーター 燃えよドラゴン | 平均評価: 7.75";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
