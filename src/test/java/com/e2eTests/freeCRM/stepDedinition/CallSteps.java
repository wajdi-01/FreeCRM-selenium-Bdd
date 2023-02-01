package com.e2eTests.freeCRM.stepDedinition;

import org.openqa.selenium.support.PageFactory;

import com.cucumber.freeCRM.Base;
import com.e2eTests.freeCRM.PageObjects.CallPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CallSteps extends Base {

	private CallPage callPage = new CallPage();

	@Given("click on New Call button")
	public void click_on_New_Call_button() {
		PageFactory.initElements(driver, CallPage.class);
		callPage.clickOnCallButton();
	}

	@When("click on Lookup button")
	public void click_on_Lookup_button() {
		callPage.clickOnLookupButton();

	}

	@When("enter the deal Id {string} in the search field")
	public void eenter_the_deal_Id_in_the_search_field(String dealId) {
		callPage.enterId(dealId);

	}

	@When("click on Search")
	public void click_on_Search_Button() {
		callPage.clickOnSearchButton();

	}

	@When("click on the deal01")
	public void click_on_the_deal01() {
		callPage.clickOnSearchDealResult();
	}

	@When("click on save button")
	public void click_on_ave_button() {
		callPage.clickOnSaveButton();
	}

	@Then("user sould be taken to the deal details")
	public void user_sould_be_taken_to_the_deal_details() {
		callPage.callInformationAssertPage();
	}
}
