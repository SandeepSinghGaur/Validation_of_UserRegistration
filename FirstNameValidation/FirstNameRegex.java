package FirstNameValidation;

/**
 * @author Sandeep_Singh
 * Functionality Check User Enter the Valid First Name or not 
 *
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstNameRegex {
	public static boolean first_name(String insert_first_name) {
		Pattern pat = Pattern.compile("^([A-Z][A-Za-z]{2,})$");
		Matcher match = pat.matcher(insert_first_name);
		boolean result1 = match.matches();
		return result1;
	}

	public static void main(String[] args) {

	}

}
