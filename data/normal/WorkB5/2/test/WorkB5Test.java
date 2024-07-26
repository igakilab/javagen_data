import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB5Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "Hello Java Programming\nJava\nPython\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "文字列を入力してください:\n検索したい文字列を入力してください:\n置換後の文字列を入力してください:\n入力した文字列は検索文字列を含んでいます。\n置換後の文字列は以下の通りです:\nHello Python Programming\n全て大文字に変換した文字列は以下の通りです:\nHELLO JAVA PROGRAMMING\n全て小文字に変換した文字列は以下の通りです:\nhello java programming";
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
        input = "Hello World\nJava\nPython\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB5.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "文字列を入力してください:\n検索したい文字列を入力してください:\n置換後の文字列を入力してください:\n入力した文字列は検索文字列を含んでいません。\n全て大文字に変換した文字列は以下の通りです:\nHELLO WORLD\n全て小文字に変換した文字列は以下の通りです:\nhello world";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
