package com.e2eTests.freeCRM.PageObjects;

import java.time.Duration;

import org.openqa.selenium.support.PageFactory;

import com.cucumber.freeCRM.Base;

import com.e2eTests.freeCRM.stepDedinition.LoginPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends Base {

	private LoginPage loginPage = new LoginPage();

										//*** Login Valid , @loginCRM ***//
	@Given("open the application url")
	public void open_the_application_url() {

		lunchBrowser();
		driver.get(props.getProperty("url"));
	}

	@When("enter valid email {string}")
	public void enter_valid_email(String email) {
		PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterEmail(email);
	}

	@When("enter a valid password {string}")
	public void enter_a_valid_password(String password) {
		loginPage.enterPassword(password);
	}

	@When("click on login button")
	public void click_on_login_button() {
		loginPage.clickOnloginButton();
	}

	@Then("user should be taken to the account page")
	public void user_should_be_taken_to_the_account_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		loginPage.homaPageIsDisplayed();
	}
						
											//*** Login Fail , @loginFailCRM ***//
	
	@Then("entre email <{string}>")
	public void entre_email(String email) {
		PageFactory.initElements(driver, LoginPage.class);
		loginPage.enterEmail(email);
	}

	@Then("enter password <{string}>")
	public void enter_password(String password) {
		loginPage.enterPassword(password);
	}

	@Then("login failed error message should be displayed")
	public void login_failed_error_message_should_be_displayed() {
		loginPage.loginPageIsDisplayed();
	}
											//*** Login Page Links ***//
	
	@When("click on SigUp link")
	public void click_on_sig_up_link() {
		PageFactory.initElements(driver, LoginPage.class);
		loginPage.clickOnSigupLink();
	}

	@Then("user should be taken to the SigUp page")
	public void user_should_be_taken_to_the_sig_up_page() {
		loginPage.submitButtonIsDisplayed();
	}
	@When("click on Pricing link")
	public void click_on_Pricing_link() {
		PageFactory.initElements(driver, LoginPage.class);
		loginPage.clickOnPircingLink();
	}
	@Then("user should be taken to the Pricing page")
	public void user_should_be_taken_to_the_Pricing_page() {
		loginPage. getFreeCrmButtonIsDisplayed();
	}
	@When("click on Customers link")
	public void click_on_Customers_link() {
		PageFactory.initElements(driver, LoginPage.class);
		loginPage.clickOnCustomersLink();
	}
	@Then("user should be taken to the Customers page")
	public void user_should_be_taken_to_the_Customers_page() {
		loginPage.customersPageAssert();
	}
	
	@When("click on Contatct link")
	public void click_on_Contatct_link() {
		
	}
	@Then("user should be taken to the Contatct page")
	public void user_should_be_taken_to_the_Contatct_page() {
		
	}
}
