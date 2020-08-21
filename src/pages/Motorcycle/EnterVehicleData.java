package pages.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import driver.Driver;
import libraries.CommonLibrary;

public class EnterVehicleData {

	WebDriver dr;
	CommonLibrary lib = new CommonLibrary();

	public EnterVehicleData(WebDriver dr) {
		this.dr = dr;
	}

	By entervehicledata = By.xpath("//a[@id='entervehicledata']");

	public void navigateToEnterVehicleData() {
		dr.findElement(entervehicledata);
	}

	By motorcycle = By.xpath("//a[@id='nav_motorcycle']");

	By make = By.xpath("//select[@id='make']");
	By model = By.xpath("//select[@id='model']");
	By cylindercapacity = By.xpath("//input[@id='cylindercapacity']");
	By enginePerformance = By.xpath("//input[@id='engineperformance']");
	By dateofmanufacture = By.xpath("//input[@id='dateofmanufacture']");
	By numberofseatsmotorcycle = By.xpath("//select[@id='numberofseatsmotorcycle']");
	By listprice = By.xpath("//input[@id='listprice']");
	By annualmileage = By.xpath("//input[@id='annualmileage']");
	By next = By.xpath("//button[@id='nextenterinsurantdata']");
	By ListPrice = By.xpath("//label[text()='List Price [$]']");
	By CylinderCapacity = By.xpath("//label[text()='Cylinder Capacity [ccm]']	");
	By AnnualMileage = By.xpath("//label[text()='Annual Mileage [mi]']	");
	By NumberOfSeat = By.xpath("//label[text()='Number of Seats']	");
	By Engineperformance = By.xpath("//label[text()='Engine Performance [kW]']	");
	By DateOfManufacture = By.xpath("//label[text()='Date of Manufacture']	");
	By NextButton = By.xpath("//button[text()='Next »']	");
	By Model = By.xpath("//label[text()='Model']");
	By Make = By.xpath("//label[@class='main']");
	By OpenDateOfcalenderButton = By.xpath("//i[@class='fa fa-calendar-plus-o']");
	By OpenNext = By.xpath("//a[@class='ui-datepicker-next ui-corner-all']");
	By OpenPrev = By.xpath("//a[@class='ui-datepicker-prev ui-corner-all']");
	By EnginePerformanceError = By.xpath("//input[@id='engineperformance']/../span[@class='error']");
	By CylinderCapacityError = By.xpath("//input[@id='cylindercapacity']/../span[@class='error']");
	By ListPriceError = By.xpath("//input[@id='listprice']/../span[@class='error']");
	By AnnualMileageError = By.xpath("//input[@id='annualmileage']/../span[@class='error']");
	By CalenderError = By.xpath("//input[@id='dateofmanufacture']/../span[@class='error hidden']");

	public boolean isMakeDropdownDisplayed() {

		return lib.isElementPresent(dr, make);
	}

	public boolean isModelDropdownDisplayed() {
		return lib.isElementPresent(dr, model);

	}

	public boolean isCylinderCapacityTextboxDisplayed() {
		return lib.isElementPresent(dr, cylindercapacity);

	}

	public boolean isNumberOfSeatsDropdownDisplayed() {
		return lib.isElementPresent(dr, numberofseatsmotorcycle);

	}

	public boolean isListPriceTextboxDisplayed() {
		return lib.isElementPresent(dr, listprice);

	}

	public boolean isEnginePerformanceTextboxDisplayed() {
		return lib.isElementPresent(dr, enginePerformance);
	}

	public boolean isAnnualMileageTextboxDispiayed() {
		return lib.isElementPresent(dr, annualmileage);
	}

	public boolean isDateofManufactureTextboxDispiayed() {
		return lib.isElementPresent(dr, dateofmanufacture);
	}

	public boolean isNextButtonDisplayed() {
		return lib.isElementPresent(dr, next);
	}

	public boolean isOpenDateOfCalenderButtonDisplayed() {
		return lib.isElementPresent(dr, OpenDateOfcalenderButton);
	}

	public void Makeselectmaker(String visibleText) {

		Assert.assertEquals(true, lib.isElementPresent(dr, make));

		lib.selectByVisibleText(dr, make, visibleText);
	}

	public void ModelselectMaker(String visibleText) {

		// Verify element is present
		Assert.assertEquals(true, lib.isElementPresent(dr, model));

		lib.selectByVisibleText(dr, model, visibleText);

		/*
		 * WebElement makeDropDown=dr.findElement(By.xpath("//select[@id='model']"));
		 * Select sel1=new Select(makeDropDown); sel1.selectByIndex(2);
		 * Thread.sleep(3000);
		 */

	}

	public void NumberOfSeatsselectMaker(String visibleText) {
		Assert.assertEquals(true, lib.isElementPresent(dr, numberofseatsmotorcycle));

		lib.selectByVisibleText(dr, numberofseatsmotorcycle, visibleText);
	}

	public void enterEnginePerformace(String EnginePerformanceinkW) {

		dr.findElement(enginePerformance).sendKeys("12340");
		Assert.assertEquals(dr.findElement(EnginePerformanceError).isDisplayed(), true);
		dr.findElement(enginePerformance).clear();

		dr.findElement(enginePerformance).sendKeys("abcd");
		Assert.assertEquals(dr.findElement(EnginePerformanceError).isDisplayed(), true);
		dr.findElement(enginePerformance).clear();

		dr.findElement(enginePerformance).sendKeys("2001");
		Assert.assertEquals(dr.findElement(EnginePerformanceError).isDisplayed(), true);
		dr.findElement(enginePerformance).clear();
		dr.findElement(enginePerformance).sendKeys("1234");
		Assert.assertEquals(dr.findElement(EnginePerformanceError).isDisplayed(), false);
	}

	public void enterCylinderCapacity(String CylinderCapacityinccm) {

		dr.findElement(cylindercapacity).sendKeys("0");
		Assert.assertEquals(dr.findElement(CylinderCapacityError).isDisplayed(), true);
		dr.findElement(cylindercapacity).clear();
		dr.findElement(cylindercapacity).sendKeys("abcd");
		Assert.assertEquals(dr.findElement(CylinderCapacityError).isDisplayed(), true);
		dr.findElement(cylindercapacity).clear();
		dr.findElement(cylindercapacity).sendKeys("2001");
		Assert.assertEquals(dr.findElement(CylinderCapacityError).isDisplayed(), true);
		dr.findElement(cylindercapacity).clear();
		dr.findElement(cylindercapacity).sendKeys("1500");
		Assert.assertEquals(dr.findElement(CylinderCapacityError).isDisplayed(), false);
	}

	public void enterListPrice(String ListPricein$) {

		dr.findElement(listprice).sendKeys("abcd");
		Assert.assertEquals(dr.findElement(ListPriceError).isDisplayed(), true);
		dr.findElement(listprice).clear();

		dr.findElement(listprice).sendKeys("499");
		Assert.assertEquals(dr.findElement(ListPriceError).isDisplayed(), true);
		dr.findElement(listprice).clear();
		dr.findElement(listprice).sendKeys("2400000");
		Assert.assertEquals(dr.findElement(ListPriceError).isDisplayed(), true);
		dr.findElement(listprice).clear();
		dr.findElement(listprice).sendKeys("501");
		Assert.assertEquals(dr.findElement(ListPriceError).isDisplayed(), false);
		dr.findElement(listprice).clear();
		dr.findElement(listprice).sendKeys("23400");
		Assert.assertEquals(dr.findElement(ListPriceError).isDisplayed(), false);

	}

	public void enterAnnualMileage(String AnnualMileageinmi) {

		dr.findElement(annualmileage).sendKeys("99");
		Assert.assertEquals(dr.findElement(AnnualMileageError).isDisplayed(), true);
		dr.findElement(annualmileage).clear();
		dr.findElement(annualmileage).sendKeys("100001");
		Assert.assertEquals(dr.findElement(AnnualMileageError).isDisplayed(), true);
		dr.findElement(annualmileage).clear();
		dr.findElement(annualmileage).sendKeys("abcd");
		Assert.assertEquals(dr.findElement(AnnualMileageError).isDisplayed(), true);
		dr.findElement(annualmileage).clear();
		dr.findElement(annualmileage).sendKeys("123");
		Assert.assertEquals(dr.findElement(AnnualMileageError).isDisplayed(), false);
		dr.findElement(annualmileage).clear();
		dr.findElement(annualmileage).sendKeys("23450");
		Assert.assertEquals(dr.findElement(AnnualMileageError).isDisplayed(), false);

	}

	public void enterDateofManufacture(String Date) {

		dr.findElement(dateofmanufacture).sendKeys("15/08/2020");
		Assert.assertEquals(dr.findElement(CalenderError).isDisplayed(), true);
		dr.findElement(dateofmanufacture).clear();
		dr.findElement(dateofmanufacture).sendKeys("abcd");
		Assert.assertEquals(dr.findElement(CalenderError).isDisplayed(), true);
		dr.findElement(dateofmanufacture).clear();
		dr.findElement(dateofmanufacture).sendKeys("12/10/2019");
		Assert.assertEquals(dr.findElement(CalenderError).isDisplayed(), false);

	}

	public void clickNextButton() {
		dr.findElement(next).click();
	}

	public String getCylinderCapacityText() {
		return dr.findElement(CylinderCapacity).getText();
	}

	public String getAnnualMileageText() {
		return dr.findElement(AnnualMileage).getText();
	}

	public String getListpriceText() {
		return dr.findElement(ListPrice).getText();

	}

	public String getNumberofSeatsText() {
		return dr.findElement(NumberOfSeat).getText();

	}

	public String getEnginePerformanceText() {
		return dr.findElement(Engineperformance).getText();
	}

	public String getDateOfManufactureText() {
		return dr.findElement(DateOfManufacture).getText();
	}

	public String getNextButtonText() {
		return dr.findElement(NextButton).getText();
	}

	public String getMakeText() {
		return dr.findElement(Make).getText();
	}

	public String getModelText() {
		return dr.findElement(Model).getText();
	}

	public void clickOpenDateOfCalenderButton() {
		dr.findElement(OpenDateOfcalenderButton).click();
	}

	public void clickOpenNextButton() {
		dr.findElement(OpenNext).click();
	}

	public void clickOpenPrevButton() {
		dr.findElement(OpenPrev).click();
	}

	public boolean isOpenNextDisplayed() {
		return lib.isElementPresent(dr, OpenNext);
	}

	public boolean isOpenPrevButtonDisplayed() {
		return lib.isElementPresent(dr, OpenPrev);
	}

}
