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
        input = "1\nAlice\n20\n2\n1\nBob\n22\n2\n3\n";
        System.setIn(new ByteArrayInputStream(input.getBytes()));
        WorkB6.main(str);
        actualOutput = outputStream.toString().trim();
        String answer = "1: Add student\n2: Display students\n3: Exit\nChoose option (1-3): Enter student name: Enter student age: Student added.\n1: Add student\n2: Display students\n3: Exit\nChoose option (1-3): Number of students: 1\n1: Name: Alice, Age: 20\n1: Add student\n2: Display students\n3: Exit\nChoose option (1-3): Enter student name: Enter student age: Student added.\n1: Add student\n2: Display students\n3: Exit\nChoose option (1-3): Number of students: 2\n1: Name: Alice, Age: 20\n2: Name: Bob, Age: 22\n1: Add student\n2: Display students\n3: Exit\nChoose option (1-3): Exiting...";
        Assertions.assertEquals(answer.replaceAll("[	 ]+", ""), actualOutput.replaceAll("[	 ]+", "").replaceAll("\\r\\n|\\r|\\n", "\n"));

        System.setIn(System.in);
        outputStream.reset();
        System.setOut(System.out);
    }
}
