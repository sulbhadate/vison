package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilityLayer.UtilsClass.*;
import static UtilityLayer.SelectClass.*;

import BaseClass.BaseClass;

public class UserRegisterPage extends BaseClass {

	@FindBy(name = "input_1")
	private WebElement firstname;

	@FindBy(name = "input_2")
	private WebElement lastname;

	@FindBy(name = "input_3")
	private WebElement email;

	@FindBy(name = "input_7")
	private WebElement businessname;

	@FindBy(name = "input_8")
	private WebElement jobtitle;

	@FindBy(name = "input_4")
	private WebElement username;

	@FindBy(name = "input_5")
	private WebElement password;

	@FindBy(name = "input_5_2")
	private WebElement conPassword;

	@FindBy(name = "input_9.1")
	private WebElement streetAdd;

	@FindBy(name = "input_9.2")
	private WebElement address2;

	@FindBy(name = "input_9.3")
	private WebElement city;

	@FindBy(name = "input_9.4")
	private WebElement state;

	@FindBy(name = "input_9.5")
	private WebElement postalcode;

	@FindBy(name = "input_9.6")
	private WebElement country;

	@FindBy(xpath = "//select[@name='input_9.6']/option")
	private WebElement allcountry;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement submit;

	public UserRegisterPage() {
		PageFactory.initElements(driver, this);
	}

	public void userinformationFunctinality(String fname, String lname, String Email, String Businessname) {

		sendKeys(firstname, fname);
		sendKeys(lastname, lname);
		sendKeys(email, Email);
		sendKeys(businessname, Businessname);
	}

	public void userMailinginformationFunctinality(String JobTitle, String uname, String Password, String cpassword) {

		sendKeys(jobtitle, JobTitle);
		sendKeys(username, uname);
		sendKeys(password, Password);
		sendKeys(conPassword, cpassword);
	}

	public void userAddressformationFunctinality(String sAddress, String add2, String City, String State,
			String Postalcode, String Country) {

		sendKeys(streetAdd, sAddress);
		sendKeys(address2, add2);
		sendKeys(city, City);
		sendKeys(state, State);
		sendKeys(postalcode, Postalcode);
		click(country);
		selectDropDown(country, Country);
	}

	public void clickOnSubmit() {
		click(submit);
	}

}
