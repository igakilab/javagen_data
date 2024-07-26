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
        input = "1\n田中\n2\n鈴木\n部長\n3\n4\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB3.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "1: 社員を検索 | 2: 役職を更新 | 3: 一覧表示 | 4: 終了\n社員名を入力してください：\n社員情報：名前: 田中, 入社日: 2000-01-15, 部署: 営業, 役職: 主任\n1: 社員を検索 | 2: 役職を更新 | 3: 一覧表示 | 4: 終了\n社員名を入力してください：\n新しい役職を入力してください：\n役職を更新しました：名前: 鈴木, 入社日: 2005-02-20, 部署: 総務, 役職: 部長\n1: 社員を検索 | 2: 役職を更新 | 3: 一覧表示 | 4: 終了\n全社員情報：\n名前: 田中, 入社日: 2000-01-15, 部署: 営業, 役職: 主任\n名前: 鈴木, 入社日: 2005-02-20, 部署: 総務, 役職: 部長\n名前: 佐藤, 入社日: 2010-03-25, 部署: 開発, 役職: 課長\n1: 社員を検索 | 2: 役職を更新 | 3: 一覧表示 | 4: 終了";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
