package com.skillrary.testscripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.skillrary.generic.BaseClass;
import com.skillrary.pom.SkillraryDemoLoginPage;
import com.skillrary.pom.SkillraryLoginPage;
import com.skillrary.pom.TestingPage;

public class Tc2 extends BaseClass {

	@Test
	public void tc2() throws InterruptedException {
		Thread.sleep(2000);
		SkillraryLoginPage slp = new SkillraryLoginPage(driver);
		slp.setGearsLink();
		Thread.sleep(500);
		slp.setSkillraryDemoApp();
		Thread.sleep(500);
		utilities.switchingTab(driver);
		SkillraryDemoLoginPage sdlp = new SkillraryDemoLoginPage(driver);
		WebElement dD = sdlp.getCategorydd();
		utilities.dropDowns(dD, "Testing");
		Thread.sleep(500);
		TestingPage tp = new TestingPage(driver);
		WebElement ele = tp.getFacebookLink();
		int x = tp.getFacebookLink().getLocation().getX();
		int y = tp.getFacebookLink().getLocation().getY();
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true)",ele);
		//utilities.scrollbar(driver, x, y);
		Thread.sleep(2000);
		tp.setFacebookLink();
		Thread.sleep(3000);

	}

}
