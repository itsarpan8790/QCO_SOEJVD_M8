package com.skillrary.generic;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Photo {

	public void getPhoto(WebDriver driver, String name) throws Throwable {
		Date d = new Date(); // import from java utill and not from SQL
		String currentDate = d.toString().replaceAll(":", "-");

		TakesScreenshot ts = (TakesScreenshot) driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File(IPathConstant.screenShotPath + currentDate + name + ".png");
		FileUtils.copyDirectory(src, dest);
	}

}
