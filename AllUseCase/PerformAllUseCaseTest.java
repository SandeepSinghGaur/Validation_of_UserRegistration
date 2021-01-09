package AllUseCase;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class PerformAllUseCaseTest {
	@Test
	public void check_email() {
		Scanner sc = new Scanner(System.in);
		String insert_email_name = sc.nextLine();
		boolean result = PerformAllUseCase.check_email(insert_email_name);
		assertEquals(true, result);
		sc.close();
	}
	@Test
	public void firstname() {
		Scanner sc = new Scanner(System.in);
		String insert_first_name = sc.nextLine();
		boolean result = PerformAllUseCase.first_name(insert_first_name);
		assertEquals(true, result);
		sc.close();
	}
	@Test
	public void lastname() {
		Scanner sc = new Scanner(System.in);
		String insert_last_name = sc.nextLine();
		boolean result = PerformAllUseCase.last_name(insert_last_name);
		assertEquals(true, result);
		sc.close();
	}
	@Test
	public void password_test() {
		Scanner sc = new Scanner(System.in);
		String insert_password = sc.nextLine();
		boolean result = PerformAllUseCase.passWord_match(insert_password);
		assertEquals(true, result);
		sc.close();
	}
	@Test
	public void phone() {
		Scanner sc = new Scanner(System.in);
		String insert_mobile_number = sc.nextLine();
		boolean result = PerformAllUseCase.phonenumber(insert_mobile_number);
		assertEquals(true, result);
		sc.close();
	}

}
