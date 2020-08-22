package pages.Motorcycle;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import libraries.CommonLibrary;
import pages.Motorcycle.EnterProductData;

public class EnterInsuranceData {

	WebDriver dr;
	CommonLibrary lib = new CommonLibrary();
	EnterProductData enterProductData;

	By motorcycle = By.xpath("//a[text()='Motorcycle']");
	By enterInsuranceData = By.xpath("//a[@id='enterinsurantdata']");

	public EnterInsuranceData(WebDriver dr) {

		this.dr = dr;
	}

	public void navigateToEnterInsuranceData() {
		dr.findElement(enterInsuranceData).click();
	}

	By navigator = By.xpath("//span[contains(text(),'Motor')]");

	By firstNameLabel = By.xpath("//label[text()='First Name']");
	By firstNameTextBox = By.xpath("//input[@id='firstname']");

	By lastNameLabel = By.xpath("//label[text()='Last Name']");
	By lastNameTextBox = By.xpath("//input[@id='lastname']");
	
	By countryLabel = By.xpath("//label[text()='Country']");
	By countryDropDown = By.xpath("//select[@id='country']");
	
	By zipCodeLabel = By.xpath("//label[text()='Zip Code']");
	By zipCodeTextBox = By.xpath("//input[@id='zipcode']");

	By occupationLabel = By.xpath("//label[text()='Occupation']");
	By occupationDropDown = By.xpath("//select[@id='occupation']");

	By hobbiesLabel = By.xpath("//label[text()='Hobbies']");
	By hobbiesCheckBox = By.xpath("//label[text()='Hobbies']/../p");

	By websiteLabel = By.xpath("//label[text()='Website']");
	By websiteTextBox = By.xpath("//label[text()='Website']/../input");

	By pictureLabel = By.xpath("//label[text()='Picture']");
	By pictureOpenButton = By.xpath("//button[text()='Open']");
	By pictureTextBox = By.xpath("//input[@id='picture']");

	By prevButton = By.xpath("//button[@id='preventervehicledata']");
	By nextButton = By.xpath("//button[@id='nextenterproductdata']");

	String testImgPath = System.getProperty("user.dir") + "\\src\\testData\\BMW.png";

	public boolean verifyHobbiesLabelVisibility() {
		return lib.isElementPresent(dr, hobbiesLabel);
	}

	public boolean verifyHobbiesCheckBoxVisibility() {
		return lib.isElementPresent(dr, hobbiesCheckBox);
	}

	public boolean validHobbiesSelection() {
		String hobbies = dr.findElement(hobbiesLabel).getText();
		By ele = lib.validationXpath(hobbies);
		dr.findElement(By.xpath("(//label[text()='Hobbies']/../p/label/span)[2]")).click();
		return lib.isElementPresent(dr, ele);
	}

	public boolean verifyWebsiteLabel() {
		return lib.isElementPresent(dr, websiteLabel);
	}

	public boolean verifyWebsiteTextBoxVisibility() {
		return lib.isElementPresent(dr, websiteTextBox);
	}

	public boolean validWebsiteEntry(String websiteEntry) {
		dr.findElement(websiteTextBox).clear();
		dr.findElement(websiteTextBox).sendKeys(websiteEntry);
		String website = dr.findElement(websiteLabel).getText();
		By ele = lib.validationXpath(website);
		return lib.isElementPresent(dr, ele);
	}

	/*
	 * public boolean invalidWebsiteEntry(String invalidWebsite) throws
	 * InterruptedException { dr.findElement(websiteTextBox).clear();
	 * Thread.sleep(1000); dr.findElement(websiteTextBox).sendKeys(invalidWebsite);
	 * String website = dr.findElement(websiteLabel).getText(); String path =
	 * lib.validationXpath(website); return lib.verifyValidSelections(dr, path); }
	 */

	public boolean verifyPictureLabelVisibility() {
		return lib.isElementPresent(dr, pictureLabel);
	}

	public boolean verifyPrevButtonVisibility() {
		return lib.isElementPresent(dr, prevButton);
	}

	public void ClickPrev() {
		dr.findElement(prevButton).click();
	}

	public boolean verifyPrevButtonText() {
		String prevButtonText = dr.findElement(prevButton).getText();
		return prevButtonText.equals("« Prev");
	}

	public boolean verifyNextButtonVisibility() {
		return lib.isElementPresent(dr, nextButton);
	}

	public boolean verifyNextButtonText() {
		String nextButtonText = dr.findElement(nextButton).getText();
		return nextButtonText.equals("Next »");
	}

	public void ClickNext() {
		dr.findElement(nextButton).click();
	}

	public boolean verifyOnClickNextButton() {
		boolean navigatorStatus = lib.isElementPresent(dr, navigator);
		return navigatorStatus;
	}

	public boolean verifyHobbiesOptions(String hobbyText) {
		String elementPath = "//label[text()='" + hobbyText + "']";
		By hobbyOpt = By.xpath(elementPath);
		return lib.isElementPresent(dr, hobbyOpt);
	}

	public boolean validPictureSelection() throws InterruptedException, AWTException {
		// System.out.println(testImgPath);
		dr.findElement(pictureOpenButton).click();
		Thread.sleep(3000);
		StringSelection cb = new StringSelection(testImgPath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(cb, null);

		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);

		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);

		robot.delay(2000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(2000);
		String imgName = testImgPath.substring(55);
		String imgPath = "//input[@title='" + imgName + "']";
		By imgElement = By.xpath(imgPath);
		return lib.isElementPresent(dr, imgElement);
	}

	public boolean validFirstName(String testFirstName) {
		dr.findElement(firstNameTextBox).clear();
		dr.findElement(firstNameTextBox).sendKeys(testFirstName);
		String firstNameLabelText = dr.findElement(firstNameLabel).getText();
		By ele = lib.validationXpath(firstNameLabelText);
		return lib.isElementPresent(dr, ele);
	}

	public boolean validLastName(String testLastName) {
		dr.findElement(lastNameTextBox).clear();
		dr.findElement(lastNameTextBox).sendKeys(testLastName);
		String lastNameLabelText = dr.findElement(lastNameLabel).getText();
		By ele = lib.validationXpath(lastNameLabelText);
		return lib.isElementPresent(dr, ele);
	}

	public boolean verifyOccupationOptions(String occupationOption) {
		String elementPath = "//option[text()='" + occupationOption + "']";
		By hobbyOpt = By.xpath(elementPath);
		return lib.isElementPresent(dr, hobbyOpt);
	}

	public boolean validateOccupationSelection() {
		dr.findElement(occupationDropDown).click();
		lib.selectByVisibleText(dr, occupationDropDown, "Employee");
		String occupationLabelText = dr.findElement(occupationLabel).getText();
		By ele = lib.validationXpath(occupationLabelText);
		return lib.isElementPresent(dr, ele);
	}

	public boolean validateCountrySelection() {
		dr.findElement(countryDropDown).click();
		lib.selectByVisibleText(dr, countryDropDown, "India");
		String countryLabelText = dr.findElement(countryLabel).getText();
		By ele = lib.validationXpath(countryLabelText);
		return lib.isElementPresent(dr, ele);
	}

	public boolean validateZipCode(String ZipCode) {
		dr.findElement(zipCodeTextBox).clear();
		dr.findElement(zipCodeTextBox).sendKeys(ZipCode);
		String zipCodeLabelText = dr.findElement(zipCodeLabel).getText();
		By ele = lib.validationXpath(zipCodeLabelText);
		return lib.isElementPresent(dr, ele);
		
	}

}
