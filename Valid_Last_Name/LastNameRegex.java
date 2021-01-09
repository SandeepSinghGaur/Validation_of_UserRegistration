package Valid_Last_Name;
/**
 * @author Sandeep_Singh
 * Functionality Check User Enter the Valid First Name or not 
 *
 */
import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class LastNameRegex
{
    public static boolean last_name(String last_name) {
    	Pattern pat = Pattern.compile("^([A-Z][A-Za-z]{2,})$");  
    	Matcher match = pat.matcher(last_name);  
    	boolean result1 = match.matches();
    	    return result1;
    }
    public static void main( String[] args )
    {
  
    }

}
