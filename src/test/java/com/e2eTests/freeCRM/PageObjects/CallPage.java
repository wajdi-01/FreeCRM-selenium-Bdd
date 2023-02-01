package com.e2eTests.freeCRM.PageObjects;

import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.freeCRM.Base;

public class CallPage extends Base {

	final static String CALL_BUTTON_XPATH = "//tbody/tr[3]/td[1]/div[1]/div[1]/ul[1]/li[8]/a[1]";
	final static String LOOKUP_BUTTON_XPATH = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]/fieldset[1]/form[1]/table[1]/tbody[1]/tr[14]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/input[4]";
	final static String SEARCH_FIELD_XPATH = "//input[@id='search']";
	final static String SEARCH_BUTTON_XPATH = "//tbody/tr[2]/td[1]/form[1]/input[4]";
	final static String DEAL_SEARCH_RESULT = "//a[contains(text(),'10001: deal01')]";
	final static String SAVE_BUTTON_XPATH = "//input[@type='submit']";
	final static String CALL_INFORMATION_ASSERT = "//body[1]/table[2]/tbody[1]/tr[1]/td[2]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[3]/td[1]/div[1]/table[1]/tbody[1]/tr[1]/td[1]/table[1]/tbody[1]/tr[1]/td[1]";

	// **FindBy**//
	@FindBy(how = How.XPATH, using = CALL_BUTTON_XPATH)
	public static WebElement callButtonSearch;
	@FindBy(how = How.XPATH, using = LOOKUP_BUTTON_XPATH)
	public static WebElement lookupButton;
	@FindBy(how = How.XPATH, using = SEARCH_FIELD_XPATH)
	public static WebElement searchField;
	@FindBy(how = How.XPATH, using = SEARCH_BUTTON_XPATH)
	public static WebElement searchButton;
	@FindBy(how = How.XPATH, using = DEAL_SEARCH_RESULT)
	public static WebElement dealSerchResult;
	@FindBy(how = How.XPATH, using = SAVE_BUTTON_XPATH)
	public static WebElement saveButton;
	@FindBy(how = How.XPATH, using = CALL_INFORMATION_ASSERT)
	public static WebElement callInformationAssert;

	// **Methods**//
	public void clickOnCallButton() {
		driver.switchTo().frame("mainpanel");
		callButtonSearch.click();
	}

	public void clickOnLookupButton() {
		lookupButton.click();
	}

	public void enterId(String dealId) {
		String winHandleBefore = driver.getWindowHandle();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
		}
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		}
		searchField.sendKeys(dealId);

	}

	public void clickOnSearchButton() {
		searchButton.click();
	}

	public void clickOnSearchDealResult() {
		dealSerchResult.click();
	}

	public void clickOnSaveButton() {
		for (String handle1 : driver.getWindowHandles()) {
			driver.switchTo().window(handle1);
		saveButton.click();
		}
	}

	public void callInformationAssertPage() {

		String callInfoPage = callInformationAssert.getText();
		Assert.assertTrue(callInfoPage.contains("Call Information"));
	}
}
