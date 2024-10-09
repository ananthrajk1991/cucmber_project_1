package org.stepdefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FBPositiveAndNegative extends BaseClass{
	@Given("To open the chrome and launch the fb url")
	public void to_open_the_chrome_and_launch_the_fb_url() {
		
		
		launchUrl("https://www.facebook.com/");
		
	   
	}

	@When("To Pass the invalid username {string}in email field")
	public void to_Pass_the_invalid_username_in_email_field(String email) {
		
		LoginPojo l = new LoginPojo();
		
		WebElement txtEmail = l.getTxtEmail();
		fillTextBox(txtEmail, email);
	}

	@When("To Pass the invalid password {string}in password field")
	public void to_Pass_the_invalid_password_in_password_field(String pass) {
		
		LoginPojo l = new LoginPojo();
		
		Assert.assertTrue(false);
		WebElement txtPass = l.getTxtPass();
		fillTextBox(txtPass, pass);
	}



	@When("To click the home page login button")
	public void to_click_the_home_page_login_button() {
		
		LoginPojo l = new LoginPojo();
		WebElement btnLogin = l.getBtnLogin();
		btnClick(btnLogin);
	}

	@Then("To close the chrome browser")
	public void to_close_the_chrome_browser() {
		
	  
		
	    
	    
	}
}
