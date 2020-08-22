package pages.Motorcycle;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import libraries.CommonLibrary;
import testScripts.Motorcycle.PreconditionMotorcycle;

public class SelectPriceOption {

	WebDriver dr;
	CommonLibrary lib = new CommonLibrary();

	public SelectPriceOption(WebDriver dr) 
	{
		this.dr = dr;
	}

	By priceperyear = By.xpath("//td[text()='Price per Year ($)']");
	By onlineclaim = By.xpath("//td[text()='Online Claim']");
	By claimsdiscount = By.xpath("//td[text()='Claims Discount (%)']");
	By worldwidecover = By.xpath("//td[text()='Worldwide Cover']");
	By selectoption = By.xpath("//th[text()='Select Option']");
	By selectoptionError = By.xpath("//table/..//span[text()='Select at least 1 options']");
	By silver = By.xpath("//th[text()='Silver']");
	By gold = By.xpath("//th[text()='Gold']");
	By platinum = By.xpath("//th[text()='Platinum']");
	By ultimate = By.xpath("//th[text()='Ultimate']");
	By selectsilver = By.xpath("//input[@id='selectsilver']/../span");
	By selectgold = By.xpath("//input[@id='selectgold']/../span");
	By selectplatinum = By.xpath("//input[@id='selectplatinum']/../span");
	By selectultimate = By.xpath("//input[@id='selectultimate']/../span");
	By viewquote = By.xpath("//div[text()='View Quote']");
	By downloadquote = By.xpath("//div[text()='Download Quote']");
	By nextbutton = By.xpath("//button[@id='nextsendquote']");
	By previousbutton = By.xpath("//button[@id='preventerproductdata']");

	public boolean isPriceperyearDisplayed() {
		return lib.isElementPresent(dr, priceperyear);
	}

	public boolean isOnlineclaimDisplayed() {
		return lib.isElementPresent(dr, onlineclaim);
	}

	public boolean isClaimsdiscountDisplayed() {
		return lib.isElementPresent(dr, claimsdiscount);
	}

	public boolean isWorldwidecoverDisplayed() {
		return lib.isElementPresent(dr, worldwidecover);
	}

	public boolean isSelectoptionDisplayed() {
		return lib.isElementPresent(dr, selectoption);
	}

	public boolean isSelectoptionErrorDisplayed() {
		return lib.isElementPresent(dr, selectoptionError);
	}

	public boolean isSilverDisplayed() {
		return lib.isElementPresent(dr, silver);
	}

	public boolean isGoldDisplayed() {
		return lib.isElementPresent(dr, gold);
	}

	public boolean isPlatinumDisplayed() {
		return lib.isElementPresent(dr, platinum);
	}

	public boolean isUltimateDisplayed() {
		return lib.isElementPresent(dr, ultimate);
	}

	public boolean isSelectsilverDisplayed() {
		return lib.isElementPresent(dr, selectsilver);
	}

	public boolean isSelectgoldDisplayed() {
		return lib.isElementPresent(dr, selectgold);
	}

	public boolean isSelectplatinumDisplayed() {
		return lib.isElementPresent(dr, selectplatinum);
	}

	public boolean isSelectultimateDisplayed() {
		return lib.isElementPresent(dr, selectultimate);
	}

	public boolean isViewquoteDisplayed() {
		return lib.isElementPresent(dr, viewquote);
	}

	public boolean isDownloadquoteDisplayed() {
		return lib.isElementPresent(dr, downloadquote);
	}

	public boolean isNextbuttonDisplayed() {
		return lib.isElementPresent(dr, nextbutton);
	}

	public boolean isPreviousbuttonDisplayed() {
		return lib.isElementPresent(dr, previousbutton);
	}

	public String getPriceperyearText() {
		return dr.findElement(priceperyear).getText();
	}

	public String getOnlineclaimText() {
		return dr.findElement(onlineclaim).getText();
	}

	public String getClaimsdiscountText() {
		return dr.findElement(claimsdiscount).getText();
	}

	public String getWorldwidecoverText() {
		return dr.findElement(worldwidecover).getText();
	}

	public String getSelectoptionText() {
		return dr.findElement(selectoption).getText();
	}

	public String getSilverText() {
		return dr.findElement(silver).getText();
	}

	public String getGoldText() {
		return dr.findElement(gold).getText();
	}

	public String getPlatinumText() {
		return dr.findElement(platinum).getText();
	}

	public String getUltimateText() {
		return dr.findElement(ultimate).getText();
	}

	public String getViewquoteText() {
		return dr.findElement(viewquote).getText();
	}

	public String getDownloadquoteText() {
		return dr.findElement(downloadquote).getText();
	}

	public String getNextbuttonText() {
		return dr.findElement(nextbutton).getText();
	}

	public String getPreviousbuttonText() {
		return dr.findElement(previousbutton).getText();
	}

	public void clickSelectsilver() {
		dr.findElement(selectsilver).click();
	}

	public void clickSelectgold() {
		dr.findElement(selectgold).click();
	}

	public void clickSelectplatinum() {
		dr.findElement(selectplatinum).click();
	}

	public void clickSelectultimate() {
		dr.findElement(selectultimate).click();
	}

	public void clickViewquote() {
		dr.findElement(viewquote).click();
	}

	public void clickDownloadquote() {
		dr.findElement(downloadquote).click();
	}

	public void clickNextbutton() {
		dr.findElement(nextbutton).click();
	}

	public void clickPreviousbutton() {
		dr.findElement(previousbutton).click();
	}

	public void preClassData() {
		WebElement ele = dr.findElement(By.xpath("//a[@id='nav_motorcycle']"));
		String data = ele.getText();
		ele.click();
		WebElement makeDropDown = dr.findElement(By.name("Make"));
		Select sel = new Select(makeDropDown);
		sel.selectByIndex(3);
		WebElement makeDropDown1 = dr.findElement(By.name("Model"));
		Select sel1 = new Select(makeDropDown1);
		sel1.selectByIndex(2);
		dr.findElement(By.id("cylindercapacity")).sendKeys("165");
		dr.findElement(By.id("engineperformance")).sendKeys("505");
		dr.findElement(By.id("dateofmanufacture")).sendKeys("10/31/2012");
		WebElement makeDropDown2 = dr.findElement(By.id("numberofseatsmotorcycle"));
		Select sel2 = new Select(makeDropDown2);
		sel2.selectByIndex(2);
		dr.findElement(By.id("listprice")).sendKeys("523");
		dr.findElement(By.id("annualmileage")).sendKeys("1234");
		dr.findElement(By.id("nextenterinsurantdata")).click();
		dr.findElement(By.id("firstname")).sendKeys("ABC");
		dr.findElement(By.id("lastname")).sendKeys("DEF");
		dr.findElement(By.id("birthdate")).sendKeys("10/11/2000");
		WebElement makeDropDown4 = dr.findElement(By.name("Country"));
		Select sel4 = new Select(makeDropDown4);
		sel4.selectByIndex(1);
		dr.findElement(By.id("zipcode")).sendKeys("123345");
		WebElement makeDropDown5 = dr.findElement(By.name("Occupation"));
		Select sel5 = new Select(makeDropDown5);
		sel5.selectByIndex(1);
		WebElement check = dr.findElement(By.xpath("//label[contains(.,'Bungee')]/span"));
		boolean isSelected = check.isSelected();
		check.click();
		isSelected = check.isSelected();
		dr.findElement(By.id("nextenterproductdata")).click();
		dr.findElement(By.id("startdate")).sendKeys("10/31/2020");
		WebElement makeDropDown6 = dr.findElement(By.name("Insurance Sum"));
		Select sel6 = new Select(makeDropDown6);
		sel6.selectByIndex(2);
		WebElement makeDropDown8 = dr.findElement(By.id("damageinsurance"));
		Select sel8 = new Select(makeDropDown8);
		sel8.selectByIndex(1);
		WebElement check1 = dr.findElement(By.xpath("//label[contains(.,'Euro Protection')]/span"));
		boolean isSelected1 = check1.isSelected();
		check1.click();
		isSelected1 = check1.isSelected();
		dr.findElement(By.id("nextselectpriceoption")).click();
	}

}
