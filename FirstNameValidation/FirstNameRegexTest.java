package FirstNameValidation;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import org.junit.Test;
public class FirstNameRegexTest {
	@Test
	public void check_first_name() {
		Scanner sc = new Scanner(System.in);
		String insert_first_name = sc.nextLine();
		boolean result = FirstNameRegex.first_name(insert_first_name);
		assertEquals(true, result);
		sc.close();
	}
}




