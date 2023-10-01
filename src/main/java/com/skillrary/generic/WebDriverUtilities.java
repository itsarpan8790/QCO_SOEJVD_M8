package com.skillrary.generic;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtilities {

	// 1.Handling Dropdown
	public void dropDowns(WebElement ele, String text) {
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}

	// 2.Handling mouse hover
	public void mouseHover(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}

	// 3.Hadling right click
	public void rightClick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}

	// 4.Handling double click
	public void doubleKlick(WebDriver driver, WebElement ele) {
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}

	// 5.Handling drag and drop
	public void dragDrop(WebDriver driver, WebElement src, WebElement target) {
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}

	// 6.Handling frames
	public void switchFrame(WebDriver driver, WebElement ele) {
		driver.switchTo().frame(ele);
	}

	// 7.Handling default content
	public void swithBackToFrame(WebDriver driver) {
		driver.switchTo().defaultContent();
	}

	// 8.Handling parent frames
	public void switchFrame(WebDriver driver) {
		driver.switchTo().parentFrame();
	}

	// 9.Handling child browser popup
	public void switchingTab(WebDriver driver) {
		Set<String> allWid = driver.getWindowHandles();
		for (String wid : allWid) {
			driver.switchTo().window(wid);
		}

	}

	// 10 Handling parent window
	public void parentWindow(WebDriver driver) {
		String parent = driver.getWindowHandle();
		driver.switchTo().window(parent);
	}

	// 11.Hadling scrollBars
	public void scrollbar(WebDriver driver, int x, int y) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(" + x + "," + y + ")");
	}

	// 12. Handling Explicit wait
	public void explicit(WebDriver driver, WebElement ele, Duration time) {
		WebDriverWait wait = new WebDriverWait(driver, time);
		wait.until(ExpectedConditions.elementToBeClickable(ele));

	}

	// 13. Handling Popups
	public void popups(WebDriver driver) {
		driver.switchTo().alert().accept();

	}

}
