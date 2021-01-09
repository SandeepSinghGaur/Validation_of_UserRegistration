package EmailValidation;

/**
 * @author Sandeep_Singh
 * Functionality Check User Enter the Valid Email Name or not 
 *
 */
import java.util.regex.*;

public class EmailName {
	public static boolean email(String insert_email_name) {
		Pattern pat = Pattern.compile("^[1-9A-Za-z]+[.][a-zA-Z]*@(bl)[.](co)([.](in))?$");
		Matcher match = pat.matcher(insert_email_name);
		boolean result1 = match.matches();
		return result1;
	}
	public static void main(String[] args) {
	}
}

