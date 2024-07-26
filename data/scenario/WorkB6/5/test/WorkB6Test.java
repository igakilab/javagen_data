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
        input = "2\nAlpha\n20230101\n20230110\n2\nAlice\nBob\nBeta\n20230201\n20230220\n3\nAlice\nCharlie\nDavid\nAlice\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "Enter the number of projects:\nEnter project name:\nEnter project start date (yyyyMMdd):\nEnter project end date (yyyyMMdd):\nEnter number of project members:\nEnter member name:\nEnter member name:\nEnter project name:\nEnter project start date (yyyyMMdd):\nEnter project end date (yyyyMMdd):\nEnter number of project members:\nEnter member name:\nEnter member name:\nEnter member name:\nEnter the name of the member to search for their projects:\nProjects involving Alice:\nProject: Alpha, Start Date: 20230101, End Date: 20230110, Members: [Alice, Bob]\nProject: Beta, Start Date: 20230201, End Date: 20230220, Members: [Alice, Charlie, David]\nTotal number of projects: 2\nProject Alpha duration: 9 days\nProject Beta duration: 19 days";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
