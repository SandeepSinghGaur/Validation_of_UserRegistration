package Valid_Last_Name;

import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import org.junit.Test;

public class LastNameRegexTest {
	@Test
	public void check_last_name() {
		Scanner sc = new Scanner(System.in);
		String insert_last_name = sc.nextLine();
		boolean result = LastNameRegex.last_name(insert_last_name);
		assertEquals(true, result);
		sc.close();
	}
}
