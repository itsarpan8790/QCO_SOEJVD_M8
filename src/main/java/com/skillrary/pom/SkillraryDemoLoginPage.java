package com.skillrary.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryDemoLoginPage {

	// course
	@FindBy(id = "course")
	private WebElement courseLink;

	// java link
	//setTimeout(function() {debugger;},6000);--in console for freezing
	@FindBy(xpath = "(//a[text()='Java'])[1]")
	private WebElement javaLink;

	// categorydropdown
	@FindBy(name = "addresstype")
	private WebElement categorydd;

	// feedbackLink
	@FindBy(xpath = "//a[text()='FEEDBACK']")
	private WebElement feedbackLink;

	// initialisation
	public SkillraryDemoLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilisation
	// for course and dd--getters

	public WebElement getCourseLink() {
		return courseLink;
	}

	public WebElement getCategorydd() {
		return categorydd;
	}

	public void setJavaLink() {
		javaLink.click();

	}

	public void setFeedbackLink() {
		feedbackLink.click();
		;
	}

}
