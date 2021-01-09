package PhoneNumberValidation;
/**
 * @author Sandeep_Singh
 * @Functionality Check Phone Number is valid or not. 
 *
 */
import java.util.regex.*;
public class PhoneNumber1 {
	public static boolean phone_number(String mobile_number) {
		Pattern pat = Pattern.compile("^(91)[ ][789][0-9]{9}$");
		Matcher match = pat.matcher(mobile_number);
		boolean result1 = match.matches();
		return result1;
	}
	public static void main(String[] args) {
		System.out.println("Check Phone Number  is Valid or not ");
		System.out.println("Please Enter the Phone Number");

	}
}
