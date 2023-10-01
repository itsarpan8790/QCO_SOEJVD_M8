package com.skillrary.testscripts;

import org.testng.annotations.Test;

import com.skillrary.generic.BaseClass;
import com.skillrary.pom.SkillraryDemoLoginPage;
import com.skillrary.pom.SkillraryLoginPage;

public class Tc1 extends BaseClass {
	
	@Test
	public void tc1() throws Throwable {
		Thread.sleep(10);
		SkillraryLoginPage slp = new SkillraryLoginPage(driver);
		slp.setGearsLink();
		slp.setSkillraryDemoApp();
		utilities.switchingTab(driver);
		SkillraryDemoLoginPage sdlp = new SkillraryDemoLoginPage(driver);
		utilities.mouseHover(driver, sdlp.getCourseLink());
		sdlp.setJavaLink();
		// utilities.doubleKlick(driver, sdlp.get);
	}

}