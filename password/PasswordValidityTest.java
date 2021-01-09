package password;

import static org.junit.Assert.assertEquals;
import java.util.Scanner;
import org.junit.Test;

public class PasswordValidityTest {
	@Test
	public void checkpassword() {
		Scanner sc = new Scanner(System.in);
		String insert_password = sc.nextLine();
		boolean result = PasswordValidity.check_password(insert_password);
		assertEquals(true, result);
		sc.close();
	}

}
