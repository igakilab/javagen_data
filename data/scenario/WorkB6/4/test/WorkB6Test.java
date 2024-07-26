import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class WorkB6Test {

    @Test
    public void mainTest1() {
        String input = "";
        String actualOutput = "";
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
        String[] str = new String[0];
        input = "25\n35\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "Enter the minimum age:\nEnter the maximum age:\nEmployees between ages 25 and 35:\nName: John Doe, Age: 30, Department: Engineering\nName: Michael Brown, Age: 28, Department: HR";
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
        input = "40\n50\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "Enter the minimum age:\nEnter the maximum age:\nEmployees between ages 40 and 50:\nName: Jane Smith, Age: 45, Department: Marketing";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
