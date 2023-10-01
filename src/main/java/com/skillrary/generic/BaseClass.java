package com.skillrary.generic;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	public WebDriver driver;
	public WebDriverUtilities utilities=new WebDriverUtilities();
	public PropertyFile pdata = new PropertyFile();

	@BeforeMethod
	public void openApp() throws Throwable {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(pdata.getPropertyData("url"));
	}

	@AfterMethod
	public void closeApp(ITestResult result) throws Throwable {
		int status = result.getStatus(); // returns 1-Pass 2-Fail 3-Skipped
		String name = result.getName();
		if (status == 2) {
			Photo p = new Photo();
			p.getPhoto(driver, name);
		}

		driver.quit();

	}

}
