package com.skillrary.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPage {
	// Declaretion

	// Facebook webelement
	@FindBy(xpath = "(//i[@class='fa fa-facebook'])[2]")
	private WebElement facebookLink;

	public TestingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public void setFacebookLink() {

		facebookLink.click();

	}

	public WebElement getFacebookLink() {
		return facebookLink;
	}

	
	
	

}
