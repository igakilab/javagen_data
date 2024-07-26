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
        input = "Alice\n85\nBob\n90\nCharlie\n75\nend\nBob\nDavid\n88\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB3.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "学生の名前を入力してください（終了するにはendと入力）：\nAliceの成績を入力してください：\n学生の名前を入力してください（終了するにはendと入力）：\nBobの成績を入力してください：\n学生の名前を入力してください（終了するにはendと入力）：\nCharlieの成績を入力してください：\n学生の名前を入力してください（終了するにはendと入力）：\n成績を調べたい学生の名前を入力してください：\nBobの成績はリストの位置 1 です。\n新しい学生の名前を入力してください：\nDavidの成績を入力してください：\nDavidの成績を追加しました。";
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
        input = "Emily\n72\nend\nAlice\nFrank\n92\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB3.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "学生の名前を入力してください（終了するにはendと入力）：\nEmilyの成績を入力してください：\n学生の名前を入力してください（終了するにはendと入力）：\n成績を調べたい学生の名前を入力してください：\nAlice はリストに存在しません。\n新しい学生の名前を入力してください：\nFrankの成績を入力してください：\nFrankの成績を追加しました。";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
