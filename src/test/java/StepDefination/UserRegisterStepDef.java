package StepDefination;

import java.util.List;

import BaseClass.BaseClass;
import PageLayer.UserRegisterPage;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegisterStepDef extends BaseClass {
	
	public static UserRegisterPage register;
	public static List<List<String>> ls;
	
	
	@Given("User open the URL in {string} browser and user on RegisterPage")
	public void user_open_the_url_in_browser_and_user_on_register_page(String string) {
		initialization();
	}

	@When("User enter firstname and lastname and EmailAddress and BusinessName")
	public void user_enter_firstname_and_lastname_and_email_address_and_business_name(
			DataTable dataTable) {
	 ls=dataTable.asLists();
		String fname=ls.get(0).get(0);
		String lname=ls.get(0).get(1);
		String email=ls.get(0).get(2);
		String businessname=ls.get(0).get(3);
		register=new UserRegisterPage();
		register.userinformationFunctinality(fname, lname, email, businessname);	
	}

	@When("User enter JobTitle and username and Password and CPassword")
	public void user_enter_job_title_and_username_and_password_and_c_password(
			DataTable dataTable) {
		ls=dataTable.asLists();
		String jobtitle=ls.get(0).get(0);
		String uname=ls.get(0).get(1);
		String password=ls.get(0).get(2);
		String cpassword=ls.get(0).get(3);
		register=new UserRegisterPage();
		register.userMailinginformationFunctinality(jobtitle, uname, password, cpassword);
	}

	@When("User also enter StreetAddress and Address2 and city and State and PostalCode and  Country")
	public void user_also_enter_street_address_and_address2_and_city_and_state_and_postal_code_and_country(
		DataTable dataTable) {
		ls=dataTable.asLists();
		String sdrdress=ls.get(0).get(0);
		String add2=ls.get(0).get(1);
		String city=ls.get(0).get(2);
		String state=ls.get(0).get(3);
		String postalcode=ls.get(0).get(4);
		String country=ls.get(0).get(5);
		register=new UserRegisterPage();
		register.userAddressformationFunctinality(sdrdress, add2, city, state, postalcode, country);
	}
		
	

	@Then("User click on submit buttonS")
	public void user_click_on_submit_button_s() {
		register.clickOnSubmit();
		
	}

}
