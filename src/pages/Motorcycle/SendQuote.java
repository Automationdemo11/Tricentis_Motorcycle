package pages.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import libraries.CommonLibrary;
import testScripts.Motorcycle.PreconditionMotorcycle;

public class SendQuote {
	WebDriver dr;
	CommonLibrary lib = new CommonLibrary();

	public SendQuote(WebDriver dr) {
		this.dr = dr;
	}

	By email = By.xpath("//label[text()='E-Mail']");
	By emailError = By.xpath("//span[text()='Must be at least a valid email format']");
	By emailClick = By.xpath("//input[@id='email']");
	By phone = By.xpath("//label[text()='Phone']");
	By phoneError1 = By.xpath("//span[text()='Must be only digits']");
	By phoneError2 = By.xpath("//span[text()='Must be a number between 8 and 15 digits']");
	By phoneClick = By.xpath("//input[@id='phone']");
	By username = By.xpath("//label[text()='Username']");
	By usernameError = By.xpath(
			"//span[text()='Must be between 4 and 32 characters long and start with a letter. You may use letters, numbers, underscores, and one dot']");
	By usernameClick = By.xpath("//input[@id='username']");
	By password = By.xpath("//label[text()='Password']");
	By passwordError = By.xpath(
			"//span[text()='Must be at least 6 characters long, and contain at least one number, one uppercase and one lowercase letter']");
	By passwordClick = By.xpath("//input[@id='password']");
	By confirmpassword = By.xpath("//label[text()='Confirm Password']");
	By confirmpasswordError = By.xpath("//span[text()='Must have the same value as the Password field']");
	By confirmpasswordClick = By.xpath("//input[@id='confirmpassword']");
	By comments = By.xpath("//label[text()='Comments']");
	By commentsClick = By.xpath("//textarea[@id='Comments']");
	By sendemail = By.xpath("//button[@id='sendemail']");
	By prev = By.xpath("//button[@id='prevselectpriceoption']");
	By mainpage = By.xpath("//div[text()='Main page']");
	By newautomobileinsurance = By.xpath("//div[text()='New Automobile Insurance']");
	By newtruckinsurance = By.xpath("//div[text()='New Truck Insurance']");
	By newmotorcycleinsurance = By.xpath("//div[text()='New Motorcycle Insurance']");
	By newcamperinsurance = By.xpath("//div[text()='New Camper Insurance']");

	public boolean isEmailDisplayed() {
		return lib.isElementPresent(dr, email);
	}

	public boolean isPhoneDisplayed() {
		return lib.isElementPresent(dr, phone);
	}

	public boolean isUsernameDisplayed() {
		return lib.isElementPresent(dr, username);
	}

	public boolean isPasswordDisplayed() {
		return lib.isElementPresent(dr, password);
	}

	public boolean isConfirmpasswordDisplayed() {
		return lib.isElementPresent(dr, confirmpassword);
	}

	public boolean isCommentsDisplayed() {
		return lib.isElementPresent(dr, comments);
	}

	public boolean isSendemailDisplayed() {
		return lib.isElementPresent(dr, sendemail);
	}

	public boolean isPrevDisplayed() {
		return lib.isElementPresent(dr, prev);
	}

	public boolean isMainpageDisplayed() {
		return lib.isElementPresent(dr, mainpage);
	}

	public boolean isNewautomobileinsuranceDisplayed() {
		return lib.isElementPresent(dr, newautomobileinsurance);
	}

	public boolean isNewtruckinsuranceDisplayed() {
		return lib.isElementPresent(dr, newtruckinsurance);
	}

	public boolean isNewmotorcycleinsuranceDisplayed() {
		return lib.isElementPresent(dr, newmotorcycleinsurance);
	}

	public boolean isNewcamperinsuranceDisplayed() {
		return lib.isElementPresent(dr, newcamperinsurance);
	}

	public String getEmailText() {
		return dr.findElement(email).getText();
	}

	public String getPhoneText() {
		return dr.findElement(phone).getText();
	}

	public void enterEmail(String emailId) {
		dr.findElement(emailClick).sendKeys("1234");
		Assert.assertEquals(dr.findElement(emailError).isDisplayed(), true);
		dr.findElement(emailClick).clear();
		dr.findElement(emailClick).sendKeys("abcd");
		Assert.assertEquals(dr.findElement(emailError).isDisplayed(), true);
		dr.findElement(emailClick).clear();
		dr.findElement(emailClick).sendKeys(emailId);
		Assert.assertEquals(dr.findElement(emailError).isDisplayed(), false);
	}

	public void enterPhone(String phoneNum) {
		dr.findElement(phoneClick).sendKeys("1234567");
		Assert.assertEquals(dr.findElement(phoneError2).isDisplayed(), true);
		dr.findElement(phoneClick).clear();
		dr.findElement(phoneClick).sendKeys("12345678901234567");
		Assert.assertEquals(dr.findElement(phoneError2).isDisplayed(), true);
		dr.findElement(phoneClick).clear();
		dr.findElement(phoneClick).sendKeys("abcd");
		Assert.assertEquals(dr.findElement(phoneError1).isDisplayed(), true);
		dr.findElement(phoneClick).clear();
		dr.findElement(phoneClick).sendKeys(phoneNum);
	}

	public void enterUsername(String userName) {
		dr.findElement(usernameClick).sendKeys("123");
		Assert.assertEquals(dr.findElement(usernameError).isDisplayed(), true);
		dr.findElement(usernameClick).clear();
		dr.findElement(usernameClick).sendKeys("12ab");
		Assert.assertEquals(dr.findElement(usernameError).isDisplayed(), true);
		dr.findElement(usernameClick).clear();
		dr.findElement(usernameClick).sendKeys("@#$");
		Assert.assertEquals(dr.findElement(usernameError).isDisplayed(), true);
		dr.findElement(usernameClick).clear();
		dr.findElement(usernameClick).sendKeys("abcdefghijklmnopqrstuvwxyzabcddddd");
		Assert.assertEquals(dr.findElement(usernameError).isDisplayed(), true);
		dr.findElement(usernameClick).clear();
		dr.findElement(usernameClick).sendKeys(userName);
	}

	public void enterPassword(String passWord) {
		dr.findElement(passwordClick).sendKeys("12345");
		Assert.assertEquals(dr.findElement(passwordError).isDisplayed(), true);
		dr.findElement(passwordClick).clear();
		dr.findElement(passwordClick).sendKeys("123456897am");
		Assert.assertEquals(dr.findElement(passwordError).isDisplayed(), true);
		dr.findElement(passwordClick).clear();
		dr.findElement(passwordClick).sendKeys("Abcdef");
		Assert.assertEquals(dr.findElement(passwordError).isDisplayed(), true);
		dr.findElement(passwordClick).clear();
		dr.findElement(passwordClick).sendKeys("abcdef");
		Assert.assertEquals(dr.findElement(passwordError).isDisplayed(), true);
		dr.findElement(passwordClick).clear();
		dr.findElement(passwordClick).sendKeys("ABCDEF");
		Assert.assertEquals(dr.findElement(passwordError).isDisplayed(), true);
		dr.findElement(passwordClick).clear();
		dr.findElement(passwordClick).sendKeys(passWord);
		dr.findElement(confirmpasswordClick).sendKeys("12345");
		Assert.assertEquals(dr.findElement(confirmpasswordError).isDisplayed(), true);
		dr.findElement(confirmpasswordClick).clear();
		dr.findElement(confirmpasswordClick).sendKeys(passWord);
	}

	public void enterComments(String CommentS) {
		dr.findElement(commentsClick).sendKeys(CommentS);
	}

}
