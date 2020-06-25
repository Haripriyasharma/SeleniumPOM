package Listeners;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import TestBase.BaseClass;

public class CustomListeners implements ITestListener  {
	String filePath = "F:\\Softwares\\com.MavenPOM\\Screenshots\\";

	@Override
	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub

	}
	@Override
	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub

	}
	@Override
	public void onTestFailure(ITestResult result) {
		// TODO Auto-generated method stub
		System.out.println("***** Error "+result.getName()+" test has failed *****");
		String methodName=result.getName().toString().trim();

		Object currentClass = result.getInstance();
		WebDriver driver = ((BaseClass)currentClass).driver;
		takeScreenShot(methodName, driver);	
	}
	@Override
	public void onTestSkipped(ITestResult result) {

	}
	private void takeScreenShot(String methodName, WebDriver driver2) {
		File scrFile = ((TakesScreenshot)driver2).getScreenshotAs(OutputType.FILE);
		//The below method will save the screen shot in d drive with test method name 
		try {
			FileUtils.copyFile(scrFile, new File(filePath+methodName+".png"));
			System.out.println("***Placed screen shot in "+filePath+" ***");
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub

	}
	@Override
	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub

	}
	@Override
	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub

	}

}
