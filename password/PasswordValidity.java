/**
 * @author Sandeep_Singh
 * @Functionality Check Password Validity. 
 *
 */
package password;
import java.util.regex.*;
public class PasswordValidity 
{
	public static boolean check_password(String insert_password) {
		Pattern pat = Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$");  
		Matcher match = pat.matcher(insert_password);  
		boolean result1 = match.matches();
		  return result1;
		}
    public static void main( String[] args )
    {
        System.out.println("Password has some pre-defined rule");
        System.out.println("Rule No-1"+" "+"Minimun 8 characters");
        System.out.println("Rule No-2"+" "+"Should have atleast 1 upper-case");
        System.out.println("Rule No-3"+" "+"Should have atleast 1 numeric number in password");
        System.out.println("Rule No-4"+" "+"Should has exactly 1 special character");
        System.out.println( "Enter Password");
    }
}