package EmailValidation;
import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import org.junit.Test;
public class EmailTest {
	@Test
	public void check_email() {
		Scanner sc = new Scanner(System.in);
		String insert_email_name = sc.nextLine();
		boolean result = EmailName.email(insert_email_name);
		assertEquals(true, result);
		sc.close();
	}
}
