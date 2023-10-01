package com.skillrary.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InvoicePage {

	
	//download invoice
	
	@FindBy(xpath="//input[@name='downloadInvoice']")
	private WebElement downloadInvoice;
	
	
	public InvoicePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void downloadInvoiceBtn() {
		downloadInvoice.click();
	}
	
	
	
	
	
	
	
	
}



