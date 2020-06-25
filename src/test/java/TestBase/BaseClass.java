package TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static FileInputStream inputstream;
	public static Properties prop;

	public BaseClass()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		try 
		{
			inputstream = new FileInputStream("F:\\Softwares\\com.MavenPOM\\Configurations\\config.properties");
			prop = new Properties();
			prop.load(inputstream);
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
	}

		
	
}
