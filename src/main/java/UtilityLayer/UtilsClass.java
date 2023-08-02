package UtilityLayer;

import org.openqa.selenium.WebElement;

import BaseClass.BaseClass;

public class UtilsClass extends BaseClass {

	public static void sendKeys(WebElement wb, String value) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.sendKeys(value);
		}
	}

	public static void click(WebElement wb) {
		if (wb.isDisplayed() && wb.isEnabled()) {
			wb.click();
		}
	}
}
