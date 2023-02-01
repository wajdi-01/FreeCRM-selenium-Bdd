package com.e2eTests.freeCRM.PageObjects;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.freeCRM.Base;

public class ContactsPage extends Base {
	
	final static String CONTACTS_BUTTON_XPATH = "//a[contains(text(),'Contacts')]";
	final static String NEW_CONTACT_OPTION_XPATH = "//a[contains(text(),'New Contact')]";
	final static String COMBINED_FORM_OPTION_XPATH = "//tbody/tr[3]/td[1]/div[1]/div[1]/ul[1]/li[4]/ul[1]/li[2]/a[1]";
	final static String FULL_SEARCH_FROM_XPATH = "//tbody/tr[3]/td[1]/div[1]/div[1]/ul[1]/li[4]/ul[1]/li[3]/a[1]";
	
	final static String NEW_CONTACT_PAGE_ASSERT = "//input[@id='first_name']";
	final static String COMBINED_FORM_ASSERT = "//input[@id='company_name']";
	final static String FULL_SEARCH_FROM_ASSERT = "//tbody/tr[1]/td[1]/input[1]";
	
	//*FindBy*//
	@FindBy(how = How.XPATH, using = CONTACTS_BUTTON_XPATH)
	public static WebElement contactButton;
	@FindBy(how = How.XPATH, using = NEW_CONTACT_OPTION_XPATH)
	public static WebElement newContactOption;
	@FindBy(how = How.XPATH, using = COMBINED_FORM_OPTION_XPATH)
	public static WebElement combinedFromOption;
	@FindBy(how = How.XPATH, using = FULL_SEARCH_FROM_XPATH)
	public static WebElement fullSearchFromOption;
	
	@FindBy(how = How.XPATH, using = NEW_CONTACT_PAGE_ASSERT)
	public static WebElement newContactPageAssert;
	@FindBy(how = How.XPATH, using = COMBINED_FORM_ASSERT )
	public static WebElement combinedFromPageAssert;
	@FindBy(how = How.XPATH, using = FULL_SEARCH_FROM_ASSERT)
	public static WebElement fullSearchFromPageAssert;
	
	
	//**Methods**//
	
	public void performToConctactButton() {
		driver.switchTo().frame("mainpanel");
		Actions action = new Actions(driver);
		action.moveToElement(contactButton).perform();
	}
	public void clickOnNewContactOption() {
		newContactOption.click();
	}
	public void newContatctAssert() {
		Assert.assertTrue(newContactPageAssert.isDisplayed());
	}
	public void clickOnCombinedFromOption() {
		combinedFromOption.click();
	}
	public void combinedFromPageAssert() {
		Assert.assertTrue(combinedFromPageAssert.isDisplayed());
	}
	public void clickOnFullSearchOption() {
		fullSearchFromOption.click();
		
	}
	public void fullSearchFromPageAssert() {
		Assert.assertTrue(fullSearchFromPageAssert.isDisplayed());
	}
}
