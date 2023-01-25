package com.e2eTests.freeCRM.stepDedinition;


import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.cucumber.freeCRM.Base;



public class LoginPage extends Base {

	final static String USER_NAME_FIELD_XPATH = "//body/div[2]/div[1]/div[3]/form[1]/div[1]/input[1]";
	final static String PASSWORD_FIELD_XPATH = "//body/div[2]/div[1]/div[3]/form[1]/div[1]/input[2]";
	final static String LOGIN_BUTTON_XPATH = "//body/div[2]/div[1]/div[3]/form[1]/div[1]/div[1]/input[1]";
	final static String HOME_PAGE_XPATH = "//a[contains(text(),'Home')]";
	final static String SIGNUP_LINK_XPATH = "//a[contains(text(),'Sign Up')]";
	final static String SUBMIT_BUTTON_XPATH = "//div[@class='myButton']";
	final static String PIRCING_LINK_XPATH = "//a[contains(text(),'Pricing')]";
	final static String GET_FREE_CRM_BUTTON_XPATH = "//a[@class='btn btn-default squared']";
	final static String COSTOMERS_LINK_XPATH = "//a[contains(text(),'Customers')]";
	final static String CONTACT_LINK_XPATH = "//a[contains(text(),'Contact')]";
	final static String CONTACT_PAGE_LOGO = "//h1[contains(text(),'Contact us')]";
	
	//*FindBy*//
	
	@FindBy(how = How.XPATH, using = USER_NAME_FIELD_XPATH)
	public static WebElement usernameFiled;
	@FindBy(how = How.XPATH, using = PASSWORD_FIELD_XPATH)
	public static WebElement passwordFiled;
	@FindBy(how = How.XPATH, using = LOGIN_BUTTON_XPATH)
	public static WebElement loginButton;
	@FindBy(how = How.XPATH, using = HOME_PAGE_XPATH)
	public static WebElement homePage;
	@FindBy(how = How.XPATH, using = SIGNUP_LINK_XPATH)
	public static WebElement sigupLink;
	@FindBy(how = How.XPATH, using = SUBMIT_BUTTON_XPATH)
	public static WebElement submitLink;
	@FindBy(how = How.XPATH, using = PIRCING_LINK_XPATH)
	public static WebElement pircingLink;
	@FindBy (how = How.XPATH, using = GET_FREE_CRM_BUTTON_XPATH)
	public static WebElement getFreeCreButton;
	@FindBy (how = How.XPATH, using = COSTOMERS_LINK_XPATH)
	public static WebElement costomersLink;
	@FindBy(how = How.XPATH, using = CONTACT_LINK_XPATH)
	public static WebElement contactLink;
	@FindBy(how = How.XPATH, using = CONTACT_PAGE_LOGO)
	public static WebElement contactPageLogo;
	
	//*Methods*//
	
	public void enterEmail(String email)  {
		usernameFiled.sendKeys(email);
		}
	
	public void enterPassword(String password) {
	passwordFiled.sendKeys(password);
	}
	
	public void clickOnloginButton() {
		loginButton.click();
	}
	public void homaPageIsDisplayed() {
		driver.switchTo().frame("mainpanel");
		Assert.assertTrue(homePage.isDisplayed());
	}
	public void loginPageIsDisplayed() {
		Assert.assertTrue(loginButton.isDisplayed());
	}
	public void clickOnSigupLink() {
		sigupLink.click();
	}
	public void submitButtonIsDisplayed() {
		Assert.assertTrue(submitLink.isDisplayed());
	}
	public void clickOnPircingLink() {
		pircingLink.click();
	}
	public void getFreeCrmButtonIsDisplayed() {
		Assert.assertTrue(getFreeCreButton.isDisplayed());
	}
	public void clickOnCustomersLink() {
		costomersLink.click();
	}
	public void customersPageAssert() {
		String customersPageUrl = driver.getCurrentUrl();
		Assert.assertEquals(customersPageUrl, "https://classic.freecrm.com/customers.html");
		}
	public void clickOnContactLink() {
		contactLink.click();
	}
	public void contactPageAssert() {
		String contactLPageLogo = contactPageLogo.getText();
		Assert.assertEquals(contactLPageLogo, "Contact us");
	}
}
