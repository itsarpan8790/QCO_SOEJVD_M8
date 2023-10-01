package com.skillrary.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SkillraryLoginPage {

	// Declaration
	// Gears web element
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsLink;

	// Skillrary demo app list
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillraryDemoApp;

	// Search Box
	@FindBy(xpath = "//input[@name='q']")
	private WebElement searchBox;

	// Search Icon
	@FindBy(xpath = "//input[@value='go']")
	private WebElement searchIcon;

	// cockies
	@FindBy(xpath = "//a[@class='close_cookies']")
	private WebElement cookiesIcon;

	// initialisation
	public SkillraryLoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	// utilisation
	/*
	 * For Textfields (to use sendkeys) and clicking realated elements,we have to
	 * generate normal utilisation methods(i.e. setters) if not we use getters()return statement.
	 */

	public void setGearsLink() {
		gearsLink.click();
	}

	public void setSkillraryDemoApp() {
		skillraryDemoApp.click();
	}

	public void setSearchBox(String text) {
		searchBox.sendKeys(text);
	}

	public void setSearchIcon() {
		searchIcon.click();
	}

	public void setCookiesIcon() {
		cookiesIcon.click();
	}

}
