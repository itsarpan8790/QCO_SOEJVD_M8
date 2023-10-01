package com.skillrary.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	//plus icon
	@FindBy(id="add")
	private WebElement plusIcon;
	
	//add cart button
	@FindBy(xpath="//button[text()=' Add to Cart']")
	private WebElement addCartBtn;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlusIcon() {
		return plusIcon;
	}

	
	public void setAddCartButton() {
		addCartBtn.click();
	}
	
	
	
	
	
	
}
