package com.skillrary.testscripts;

import org.testng.annotations.Test;

import com.skillrary.generic.BaseClass;
import com.skillrary.pom.InvoicePage;
import com.skillrary.pom.SkillraryDemoLoginPage;
import com.skillrary.pom.SkillraryLoginPage;

public class Tc3 extends BaseClass {
	@Test
	public void tc3() throws InterruptedException {
		Thread.sleep(10);
		SkillraryLoginPage slp = new SkillraryLoginPage(driver);
		slp.setGearsLink();
		slp.setSkillraryDemoApp();
		// switching controll
		utilities.switchingTab(driver);
		SkillraryDemoLoginPage sdlp = new SkillraryDemoLoginPage(driver);
		sdlp.setFeedbackLink();
		InvoicePage iv = new InvoicePage(driver);
		iv.downloadInvoiceBtn();

	}
}
