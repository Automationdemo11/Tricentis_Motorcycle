package pages.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import libraries.CommonLibrary;

public class EnterProductData {

	WebDriver dr;
	CommonLibrary lib = new CommonLibrary();

	By enterProductData = By.xpath("//a[@id='enterproductdata']");

	public EnterProductData(WebDriver dr) {
		this.dr = dr;
	}

	public void navigateToEnterProductData() {
		dr.findElement(enterProductData).click();
	}

	By navigator = By.xpath("//span[contains(text(),'Motor')]");
	By startDateTextBox = By.xpath("//input[@id='startdate']");
	By startDateLabel = By.xpath("//label[text()='Start Date']");
	By startDateCalendar = By.xpath("//button[@id='openstartdatecalender']");
	By startDateCalPrev = By.xpath("//a[@title='Prev']");
	By startDateSelectable = By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[text()='15']");

	By insuranceSumLabel = By.xpath("//label[text()='Insurance Sum [$]']");
	By insuranceSumDropDown = By.xpath("//select[@id='insurancesum']");

	By damageInsuranceLabel = By.xpath("//label[text()='Damage Insurance']");
	By damageInsuranceDropDown = By.xpath("//select[@id='damageinsurance']");

	By optionalProductLabel = By.xpath("//label[text()='Optional Products']");
	By optionalProductsTextBox = By.xpath("//label[text()='Optional Products']/following-sibling::p/label/span");

	By prevButton = By.xpath("//button[@id='preventerinsurancedata']");
	By nextButton = By.xpath("//button[@id='nextselectpriceoption']");

	public boolean verifyStartLabelVisibility() {
		return lib.isElementPresent(dr, startDateLabel);
	}

	public boolean verifyStartDateTextBoxVisible() {
		return lib.isElementPresent(dr, startDateTextBox);
	}

	public boolean verifyCalendarClickable() {
		dr.findElement(startDateCalendar).click();
		return lib.isElementPresent(dr, startDateSelectable);
	}

	public boolean validateStartDate(String validDate) {
		dr.findElement(startDateTextBox).clear();
		dr.findElement(startDateTextBox).sendKeys(validDate);
		String startDateLabelText = dr.findElement(startDateLabel).getText();
		By ele = lib.validationXpath(startDateLabelText);
		return lib.isElementPresent(dr, ele);
	}

	public String verifyNextLabelText() {
		String labelText = dr.findElement(startDateLabel).getText();
		return lib.returnNextLabelText(dr, labelText);
	}

	public boolean verifyInsuranceSumLabelVisibility() {
		return lib.isElementPresent(dr, insuranceSumLabel);
	}

	public boolean verifyInsuranceSumDropDownVisibility() {
		return lib.isElementPresent(dr, insuranceSumDropDown);
	}

	public boolean verifyInsuranceSumOptions(String insuranceSumOption) {
		dr.findElement(insuranceSumDropDown).click();
		String elementPath = "//option[contains(text(),'" + insuranceSumOption + "')]";
		By hobbyOpt = By.xpath(elementPath);
		boolean result = lib.isElementPresent(dr, hobbyOpt);
		dr.findElement(insuranceSumDropDown).click();
		return result;
	}

	public boolean validateInsuranceSumSelection() {
		dr.findElement(By.xpath("(//select[@id='insurancesum']/option)[2]")).click();
		String insuranceSumLabelText = dr.findElement(insuranceSumLabel).getText();
		By ele = lib.validationXpath(insuranceSumLabelText);
		return lib.isElementPresent(dr, ele);
	}

	public boolean verifyDamageInsuranceLabelVisibility() {
		return lib.isElementPresent(dr, damageInsuranceLabel);

	}

	public boolean verifyDamageInsuranceDropDownVisibility() {
		return lib.isElementPresent(dr, damageInsuranceDropDown);
	}
	
	public boolean verifyDamageInsuranceOptions(String damageInsuranceOption) {
		dr.findElement(damageInsuranceDropDown).click();
		String elementPath = "//option[contains(text(),'" + damageInsuranceOption + "')]";
		By damageInsOpt = By.xpath(elementPath);
		boolean result = lib.isElementPresent(dr, damageInsOpt);
		dr.findElement(damageInsuranceDropDown).click();
		return result;
	}

	public boolean validateDamageInsuranceDropDownSelection() {
		dr.findElement(By.xpath("(//select[@id='damageinsurance']/option)[3]")).click();
		String damageInsuranceLabelText = dr.findElement(damageInsuranceLabel).getText();
		By ele = lib.validationXpath(damageInsuranceLabelText);
		return lib.isElementPresent(dr, ele);
	}

	public Object verifyOptionalProductLabelVisibility() {
		return lib.isElementPresent(dr, optionalProductLabel);
	}

	public boolean verifyOptionalProductTextBoxVisibility() {
		return lib.isElementPresent(dr, optionalProductsTextBox);
	}

	public boolean validateOptionalProductCheckBoxSelection() {
		dr.findElement(By.xpath("//label[contains(.,'Euro Protection')]/span")).click();
		String optionalProductLabelText = dr.findElement(optionalProductLabel).getText();
		By ele = lib.validationXpath(optionalProductLabelText);
		return lib.isElementPresent(dr, ele);
	}

	public boolean verifyPrevButtonVisibility() {
		return lib.isElementPresent(dr, prevButton);
	}

	public boolean verifyNextButtonVisibility() {
		return lib.isElementPresent(dr, nextButton);
	}

	public boolean verifyPrevButtonText() {
		String prevButtonText = dr.findElement(prevButton).getText();
		return prevButtonText.equals("« Prev");
	}

	public boolean verifyNextButtonText() {
		String nextButtonText = dr.findElement(nextButton).getText();
		return nextButtonText.equals("Next »");
	}

	public void ClickPrev() {
		dr.findElement(prevButton).click();
	}

}
