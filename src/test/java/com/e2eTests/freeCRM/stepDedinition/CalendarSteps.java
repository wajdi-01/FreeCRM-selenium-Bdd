package com.e2eTests.freeCRM.stepDedinition;

import org.openqa.selenium.support.PageFactory;

import com.cucumber.freeCRM.Base;
import com.e2eTests.freeCRM.PageObjects.CalendarPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CalendarSteps extends Base {

	private CalendarPage calendarPage = new CalendarPage();

	// **NEW EVENT**//
	@Given("put the mouse on Calendar button")
	public void put_the_mouse_on_calendar_button() {
		PageFactory.initElements(driver, CalendarPage.class);
		calendarPage.performToCalendarButton();
	}

	@When("click on new event option in the dropdown menu")
	public void click_on_new_event_option_in_the_dropdown_menu() {
		calendarPage.clickOnNewEventOption();
	}

	@Then("user sould be taken to the new event page")
	public void user_sould_be_taken_to_the_new_event_page() {
		calendarPage.newEventPage();
	}

	// **VIEW TODAY**//
	@When("click on View Today option in the dropdown menu")
	public void click_on_view_today_option_in_the_dropdown_menu() {
		calendarPage.ClickOnViewTodayOption();
	}

	@Then("user sould be taken to the VIew Today page")
	public void user_sould_be_taken_to_the_v_iew_today_page() {
		calendarPage.viewTodayAssert();
	}

	// **WEEK VIEW**//
	@When("click on Week View option in the dropdown menu")
	public void click_on_week_view_option_in_the_dropdown_menu() {
		calendarPage.clickOnWeekViewOption();
	}

	@Then("user sould be taken to the Week View page")
	public void user_sould_be_taken_to_the_week_view_page() {
		calendarPage.weekViewAssert();
	}

	// **MONTH VIEW**//
	@When("click on Month View option in the dropdown menu")
	public void click_on_month_view_option_in_the_dropdown_menu() {
		calendarPage.clickOnMonthViewOption();
	}

	@Then("user sould be taken to the Month View page")
	public void user_sould_be_taken_to_the_month_view_page() {
		calendarPage.monthViewAssert();
	}
	//**ADDITION OF A NEW EVENT**//
	@When("enter a title in the title field {string}")
	public void enter_a_title_in_the_title_field(String title) {
		PageFactory.initElements(driver, CalendarPage.class);
		calendarPage.enterTitle(title);
	}
	@When("choose a date from the calendar in the FROM filed")
	public void choose_a_date_from_the_calendar_in_the_FROM_filed() {
		calendarPage.chooseFromDate();
	}
	@When("choose a date from the calendar in the TO field")
	public void choose_a_date_from_the_calendar_in_the_TO_field () {
		calendarPage.chooseToDate();
	}
	@When("select a category")
	public void select_a_category() {
		calendarPage.slectCategory();
	}
	@When("click on ADD to assigne the event")
	public void click_on_ADD_to_assigne_the_event() {
		calendarPage.clickOnAdd();
	}
	@When("select YES to confirm")
	public void select_YES_to_confirm() {
		calendarPage.confirmedYes();
	}
	@When("click on SAVE button")
	public void click_on_SAVE_button() {
		calendarPage.clickOnSave();
	}
	@When("all the details of the new event are displayed")
	public void all_the_details_of_the_new_event_are_displayed() {
		calendarPage.newEventAddSuccessAssert();
	}
	@When("confirmation email is sent")
	public void confirmation_email_is_sent() {
		
	}
}
