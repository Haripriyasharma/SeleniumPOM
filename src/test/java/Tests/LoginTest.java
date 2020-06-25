package Tests;

import org.testng.annotations.Test;
import org.testng.Assert;
import Pages.Login;

public class LoginTest extends Login {

	String title;
	public LoginTest()
	{
		super();

	}
	@Test
	public void CheckTitle()
	{
		title = verify_title();
		Assert.assertEquals(title, "Orange HRM");
	                                                                                                                       }
	@Test               
	public void login1()
	{
		uname_input("Admin");
		password_input("admin123");
		login_button();
	}

}
