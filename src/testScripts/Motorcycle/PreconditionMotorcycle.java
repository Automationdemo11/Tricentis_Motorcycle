package testScripts.Motorcycle;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import driver.Driver;

public class PreconditionMotorcycle extends Driver {

	static WebDriver dr;
	static pages.Motorcycle.EnterInsuranceData motorEnterInsuranceData;
	static pages.Motorcycle.EnterVehicleData motorEnterVehicleData;
	static pages.Motorcycle.EnterProductData motorEnterProductData;
	static pages.Motorcycle.SelectPriceOption selectpriceoption;
	static pages.Motorcycle.SendQuote sendquote;
	static pages.HomePage homePage;
	
	@BeforeTest
	@Parameters("browser")
	public void launchBrowser(String browser) {
		dr = lib.launchBrowser(browser);
		homePage=new pages.HomePage(dr);
		motorEnterInsuranceData = new pages.Motorcycle.EnterInsuranceData(dr);
		motorEnterVehicleData = new pages.Motorcycle.EnterVehicleData(dr);
		motorEnterProductData = new pages.Motorcycle.EnterProductData(dr);
		selectpriceoption = new pages.Motorcycle.SelectPriceOption(dr);
		sendquote = new pages.Motorcycle.SendQuote(dr);
		homePage.clickMotorcycle();
	}
	
	@AfterTest
	public void closeBrowser() {
		dr.quit();
	}
}
