package UtilityLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BaseClass;

public class SelectClass extends BaseClass {

	public static void selectDropDown(WebElement wb, String value) {
		Select sel = new Select(wb);
		sel.selectByVisibleText(value);
	}

}
