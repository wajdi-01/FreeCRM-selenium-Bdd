package com.e2eTests.freeCRM.stepDedinition;

import org.openqa.selenium.support.PageFactory;

import com.cucumber.freeCRM.Base;
import com.e2eTests.freeCRM.PageObjects.ContactsPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ContactsSteps extends Base {

	private ContactsPage contactsPage = new ContactsPage();

	@Given("put the mouse on Contact button")
	public void put_the_mouse_on_Contact_button() {
		PageFactory.initElements(driver, contactsPage);
		contactsPage.performToConctactButton();

	}

	@When("click on new contact option in the dropdown menu")
	public void click_on_new_contact_option_in_the_dropdown_menu() {
		contactsPage.clickOnNewContactOption();
	}

	@Then("user sould be taken to the new contact page")
	public void user_sould_be_taken_to_the_new_contact_page() {
		contactsPage.newContatctAssert();
	}

	@When("click on new combined form option in the dropdown menu")
	public void click_on_new_combined_form_option_in_the_dropdown_menu() {

		contactsPage.clickOnCombinedFromOption();
	}

	@Then("user sould be taken combined form page")
	public void user_sould_be_taken_combined_form_page() {
		contactsPage.combinedFromPageAssert();
	}

	@When("click on full search form option in the dropdown menu")
	public void click_on_full_search_form_option_in_the_dropdown_menu() {
		contactsPage.clickOnFullSearchOption();
	}

	@Then("user sould be taken to full search from  page")
	public void user_sould_be_taken_to_full_search_from_page() {
		contactsPage.fullSearchFromPageAssert();
	}

}
