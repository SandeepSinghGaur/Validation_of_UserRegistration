package PhoneNumberValidation;

import static org.junit.Assert.assertEquals;

import java.util.Scanner;

import org.junit.Test;

public class PhoneNumberTest {
	@Test
	public void phonenumber() {
		Scanner sc = new Scanner(System.in);
		String mobile_number = sc.nextLine();
		boolean result = PhoneNumber1.phone_number(mobile_number);
		assertEquals(true, result);
		sc.close();
	}

}