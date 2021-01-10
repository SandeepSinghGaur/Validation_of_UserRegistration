package USER_Registration_package;


import javax.activity.InvalidActivityException;
import javax.management.InvalidApplicationException;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    @Test
    public void testFirstName() throws Exception
    {
        try
        {
            try
            {
                UserRegistration add = new UserRegistration();
                boolean output1 = add.checkName("Sandeep");
                Assert.assertTrue(output1);
            } catch (NullPointerException e) {
            }
        } catch (InvalidActivityException e) {
        }
        catch (InvalidApplicationException e)

        {
            e.printStackTrace();
        }
    }

    @Test
    public void testLastName() throws Exception
    {
    	
    try {
            try
            {
                UserRegistration lastName = new UserRegistration();
                boolean output = lastName.checkName("SinghGaur");
                Assert.assertTrue(output);}
            catch (NullPointerException e) {
                e.printStackTrace();}
            
        } 
    catch (InvalidActivityException e) {
            e.printStackTrace();}
        }
            
    @Test
    public void testEmailId() throws Exception
    {
      try
       {    try
            {
                UserRegistration newEmail = new UserRegistration();
                boolean output = newEmail.email("Sandeepgaurdec13@gmail.com");
                Assert.assertTrue(output);
            }
            catch (NullPointerException e)
             {
                e.printStackTrace();
             }
       }
       catch(InvalidActivityException e)
       {
           e.printStackTrace();
       }
    }
	@Test
	public void testMobile() throws Exception
	{
	    try
       {    try
            {
                UserRegistration phoneNumber = new UserRegistration();
                boolean output = phoneNumber.mobileNumber("91 9140401246");
                Assert.assertTrue(output);
            }
             catch (NullPointerException e)
             {
                e.printStackTrace();
             }
       }
       catch(InvalidActivityException e)
       {
           e.printStackTrace();
       }
	}
    @Test
    public void testPassword() throws Exception
    {
       try
       {    try
            {
                UserRegistration passWord = new UserRegistration();
               boolean output = passWord.password("1A2xC@1asB");
               Assert. assertTrue(output);
            }
             catch (NullPointerException e)
             {
                e.printStackTrace();
             }
       }
       catch(InvalidActivityException e)
       {
           e.printStackTrace();
       }
    }
}

