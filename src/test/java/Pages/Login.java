package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBase.BaseClass;

public class Login extends BaseClass{

	@FindBy(id="txtUsername")
	WebElement uname;

	@FindBy(id="txtPassword")
	WebElement password;

	@FindBy(id="btnLogin")
	WebElement login;

	public Login()
	{
		super();
		PageFactory.initElements(driver, this);
	}
	public String verify_title()
	{
		return driver.getTitle();

	}
	public void uname_input(String text)
	{
		uname.sendKeys(text);
	}
	public void password_input(String text)
	{
		password.sendKeys(text);
	}
	public void login_button()
	{
		login.click();
	}
}
