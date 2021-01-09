package AllUseCase;
public class PerformAllUseCase {
	public static final String fname="[A-Z][A-Za-z]{2,}";
	public static final String lname="[A-Z][A-Za-z]{2,}";
    public static  final String email="^[1-9A-Za-z]+[.][a-zA-Z]*@(bl)[.](co)([.](in))?$";
	public static final String password="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,}$";
	public static final String phone_number="^(91)[ ][789][0-9]{9}$";
	public static void main(String[] args) {
	}
		public static boolean check_email(String insert_email_name) {
			boolean result=insert_email_name.matches(email);
               return result;}
		public static boolean first_name(String insert_first_name) {
			boolean result=insert_first_name.matches(fname);
			return result;}
		public static boolean last_name(String insert_last_name) {
			boolean result=insert_last_name.matches(lname);
			return result;}
		public static boolean passWord_match(String insert_password) {
			boolean result=insert_password.matches(password);
			return result;}
		public static boolean phonenumber(String insert_mobile_number) {
			boolean result=insert_mobile_number.matches(phone_number);
			return result;
		}
		
}


