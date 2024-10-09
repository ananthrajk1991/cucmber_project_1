package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FacebookLogin extends BaseClass {
	@Given("To launch the chrome browser and hit the facebook url")
	public void to_launch_the_chrome_browser_and_hit_the_facebook_url() {

		launchUrl("https://www.facebook.com/");
		

	}

	@When("To Enter valid username in email field")
	public void to_Enter_valid_username_in_email_field(io.cucumber.datatable.DataTable d) {
		
		Map<String, String> mp = d.asMap(String.class,String.class);

		
		LoginPojo l = new LoginPojo();

		WebElement email = l.getTxtEmail();
		fillTextBox(email,mp.get("email2") );

	}

	@When("To Enter invalid password in password field")
	public void to_Enter_invalid_password_in_password_field(io.cucumber.datatable.DataTable d) {

		List<Map<String, String>> mp = d.asMaps();
		
		
		LoginPojo l = new LoginPojo();

		WebElement pass = l.getTxtPass();
		fillTextBox(pass,mp.get(2).get("password2"));

	}

	@When("To click the login button")
	public void to_click_the_login_button() {

		LoginPojo l = new LoginPojo();

		WebElement btnLogin = l.getBtnLogin();
		btnClick(btnLogin);
	}

	@Then("To close the browser")
	public void to_close_the_browser() {

		
	}
}
