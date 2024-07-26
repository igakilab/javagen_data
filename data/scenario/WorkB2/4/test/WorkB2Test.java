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
        input = "85\n60\n78\n92\n75\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB2.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "Enter the score for Alice: Enter the score for Bob: Enter the score for Charlie: Enter the score for David: Enter the score for Eve: \n--- Student Scores ---\nAlice: 85\nBob: 60\nCharlie: 78\nDavid: 92\nEve: 75\n\nHighest Score: 92 by David\nLowest Score: 60 by Bob";
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
        input = "82\n95\n70\n88\n65\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB2.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "Enter the score for Alice: Enter the score for Bob: Enter the score for Charlie: Enter the score for David: Enter the score for Eve: \n--- Student Scores ---\nAlice: 82\nBob: 95\nCharlie: 70\nDavid: 88\nEve: 65\n\nHighest Score: 95 by Bob\nLowest Score: 65 by Eve";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
