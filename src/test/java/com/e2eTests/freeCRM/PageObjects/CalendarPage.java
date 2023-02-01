package com.e2eTests.freeCRM.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.freeCRM.Base;

public class CalendarPage extends Base {

	final static String CALENDAR_BUTTON_XPATH = "//a[contains(text(),'Calendar')]";
	final static String NEW_EVENT_OPTION_XPATH = "//a[contains(text(),'New Event')]";
	final static String VIEW_TODAY_OPTION_XPATH = "//a[contains(text(),'View Today')]";
	final static String WEEK_VIEW_OPTION_XPATH = "//a[contains(text(),'Week View')]";
	final static String MONTH_VIEW_XPATH = "//a[contains(text(),'Month View')]";

	final static String NEW_EVENT_ASSERT_XPATH = "//tbody/tr[2]/td[1]/input[1]";
	final static String VIEW_TODAY_ASSERT_XPATH = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	final static String WEEK_VIEW_ASSERT_XPATH = "//tbody/tr[1]/td[1]/input[1]";
	final static String MONTH_VIEW_ASSERT_XPATH = "//select[@name='slctMonth']";

	final static String TITLE_FIELD_XPATH = "//input[@id='title']";
	final static String FROM_CALENDAR_XPATH = "//img[@id='f_trigger_c_start']";
	final static String TO_CALENDAR_XPATH = "//img[@id='f_trigger_c_end']";
	final static String CATEGORY_DROPDOWN_MENU_XPATH = "//select[@name='category']";
	final static String CATEGORY_OPTION_XPATH = "//option[contains(text(),'Social')]";
	final static String ADD_BUTTON_XPATH = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[7]/td[2]/table[1]/tbody[1]/tr[1]/td[2]/input[1]";
	final static String CONFIRMED_YES_RADIO_XPATH = "//tbody/tr[8]/td[2]/input[1]";
	final static String SAVE_BUTTON_XPATH = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[1]/td[1]/input[1]";
	final static String FROM_DATE_CHOICE = "//*[contains(text(),'Today')]";
	final static String NEW_EVENT_ADD_SUCCESS = "//strong[contains(text(),'Created at')]";
	final static String NEW_EVENT_ADD_EMAIL_CONFIRMATION = "//*[contains(text), 'Email notifications were sent to all attendees.']";

	// *FindBy*//
	@FindBy(how = How.XPATH, using = CALENDAR_BUTTON_XPATH)
	public static WebElement calendarButtonOption;
	@FindBy(how = How.XPATH, using = NEW_EVENT_OPTION_XPATH)
	public static WebElement newEventOption;
	@FindBy(how = How.XPATH, using = VIEW_TODAY_OPTION_XPATH)
	public static WebElement viewTodayOption;
	@FindBy(how = How.XPATH, using = MONTH_VIEW_XPATH)
	public static WebElement monthViewOption;
	@FindBy(how = How.XPATH, using = WEEK_VIEW_OPTION_XPATH)
	public static WebElement weekViewOption;
	@FindBy(how = How.XPATH, using = CATEGORY_OPTION_XPATH)
	public static WebElement categoryOption;
	@FindBy(how = How.XPATH, using = ADD_BUTTON_XPATH)
	public static WebElement addButton;
	@FindBy(how = How.XPATH, using = CONFIRMED_YES_RADIO_XPATH)
	public static WebElement confirmedYesCategory;
	@FindBy(how = How.XPATH, using = SAVE_BUTTON_XPATH)
	public static WebElement saveButton;
	@FindBy(how = How.XPATH, using = FROM_DATE_CHOICE)
	public static WebElement fromDateChoice;

	@FindBy(how = How.XPATH, using = NEW_EVENT_ASSERT_XPATH)
	public static WebElement newEventAssert;
	@FindBy(how = How.XPATH, using = VIEW_TODAY_ASSERT_XPATH)
	public static WebElement viewTodayAssert;
	@FindBy(how = How.XPATH, using = WEEK_VIEW_ASSERT_XPATH)
	public static WebElement weekViewAssert;
	@FindBy(how = How.XPATH, using = MONTH_VIEW_ASSERT_XPATH)
	public static WebElement monthViewAssert;

	@FindBy(how = How.XPATH, using = TITLE_FIELD_XPATH)
	public static WebElement titelField;
	@FindBy(how = How.XPATH, using = FROM_CALENDAR_XPATH)
	public static WebElement formCalendar;
	@FindBy(how = How.XPATH, using = TO_CALENDAR_XPATH)
	public static WebElement toCalendar;
	@FindBy(how = How.XPATH, using = CATEGORY_DROPDOWN_MENU_XPATH)
	public static WebElement categoryDropDown;
	@FindBy(how = How.XPATH, using = SAVE_BUTTON_XPATH)
	public static WebElement saveButtoAddNewEvent;
	@FindBy(how = How.XPATH, using = NEW_EVENT_ADD_SUCCESS)
	public static WebElement newEventAddSuccesAssert;
	@FindBy(how = How.XPATH, using = NEW_EVENT_ADD_EMAIL_CONFIRMATION)
	public static WebElement newEventAddConfirmationEmail;
	
	
	// *Methods*//
	public void performToCalendarButton() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(calendarButtonOption).build().perform();

	}

	public void clickOnNewEventOption() {
		newEventOption.click();
	}

	public void ClickOnViewTodayOption() {
		viewTodayOption.click();
	}

	public void clickOnWeekViewOption() {
		weekViewOption.click();
	}

	public void clickOnMonthViewOption() {
		monthViewOption.click();
	}

	public void newEventPage() {
		Assert.assertTrue(newEventAssert.isDisplayed());
	}

	public void viewTodayAssert() {
		Assert.assertTrue(viewTodayAssert.isDisplayed());
	}

	public void weekViewAssert() {
		Assert.assertTrue(weekViewAssert.isDisplayed());
	}

	public void monthViewAssert() {
		Assert.assertTrue(monthViewAssert.isDisplayed());
	}

	public void enterTitle(String title) {
		titelField.sendKeys(title);
	}

	public void chooseFromDate() {
		formCalendar.click();
		Actions action =new Actions(driver);
		action.moveToElement(fromDateChoice).perform();
		action.click();
		
	}

	public void chooseToDate() {
		toCalendar.click();
		Actions action =new Actions(driver);
		action.moveToElement(fromDateChoice).click().perform();
		
	}

	public void slectCategory() {
		categoryDropDown.click();
		categoryOption.click();
	}

	public void clickOnAdd() {
		addButton.click();
	}

	public void confirmedYes() {
		confirmedYesCategory.click();
	}

	public void clickOnSave() {
		saveButtoAddNewEvent.click();
	}

	public void newEventAddSuccessAssert() {
		String successAddNewEvent = newEventAddSuccesAssert.getText();
		Assert.assertTrue(successAddNewEvent.contains("Created at"));
	}
	public void emailConfirmationAssert() {
		String ConfirmEmail = newEventAddConfirmationEmail.getText();
		Assert.assertTrue(ConfirmEmail.contains("Email notifications were sent to all attendees."));
	}
}
